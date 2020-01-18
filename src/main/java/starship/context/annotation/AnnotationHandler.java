package starship.context.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class AnnotationHandler {
    public static void handle(Object object) {
        Optional.ofNullable(object).orElseThrow(() -> new IllegalArgumentException("Object can't be null."));
        Arrays.stream(object.getClass().getDeclaredMethods())
                .filter(classMethod -> classMethod.isAnnotationPresent(Call.class))
                .forEachOrdered(method -> {
                    method.setAccessible(true);
                    Annotation annotation = method.getAnnotation(Call.class);
                    Object[] annotationParams = getAnnotationParams(annotation);
                    try {
                        method.invoke(object, annotationParams);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static Object[] getAnnotationParams(Annotation annotation) {
        return Arrays.stream(Call.class.getDeclaredMethods())
                .map(annotationMethod -> {
                    try {
                        return annotationMethod.invoke(annotation);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                        return e.getMessage();
                    }
                }).filter(param -> !Objects.equals(param.toString(), "-1")).toArray();
    }
}
