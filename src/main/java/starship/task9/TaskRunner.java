package starship.task9;

public class TaskRunner {

    private static final int NUMBER = 1000;

    public static void main(String[] args) {
        PythagoreanTriplet pythagoreanTriplet = PythagoreanTriplet.getInstance();
        System.out.println(pythagoreanTriplet.findPythagoreanTripletProduct(NUMBER));
    }
}
