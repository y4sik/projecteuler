package starship.context;

import starship.context.annotation.AnnotationHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.Collectors;

public class Context {

    private static Context instance;

    private static final String CONFIG_FILE_NAME = "config.properties";

    private Map<String, String> beanDefinitions = new HashMap<>();
    private Map<String, Object> beanContainer = new HashMap<>();

    private Context() throws IOException {
        loadConfig();
    }

    public static Context getInstance() throws IOException {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }

    private void loadConfig() throws IOException {
        Properties properties = new Properties();
        properties.load(Objects.requireNonNull(Context.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME)));
        beanDefinitions = properties.entrySet().stream().collect(
                Collectors.toMap(
                        e -> e.getKey().toString(),
                        e -> e.getValue().toString()
                )
        );
    }

    public Object getBean(String beanName) throws Exception {
        Object bean = beanContainer.get(beanName);
        if (bean != null) {
            return bean;
        }
        String beanDefinition = beanDefinitions.get(beanName);
        if (beanDefinition == null) {
            throw new IllegalArgumentException(String.format("No bean with name [%s]. Check config.properties file.", beanName));
        }
        bean = Class.forName(beanDefinition).getDeclaredConstructor().newInstance();
        AnnotationHandler.handle(bean);
        beanContainer.put(beanName, bean);
        return bean;
    }

    public <T> T getBean(String beanName, Class<T> clazz) throws Exception {
        return (T) getBean(beanName);
    }

    public Map<String, String> getBeanDefinitions() {
        return beanDefinitions;
    }
}
