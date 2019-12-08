package starship.task8;

public class Task8 {

    public static long largestProductInSeries(int adjacent, String number) {
        long maxProduct = 1;
        for (int i = 0; i < number.length() - adjacent; i++) {
            long currentProduct = 1;
            for (int j = i; j < i + adjacent; j++) {
                currentProduct *= Character.getNumericValue(number.charAt(j));
            }
            maxProduct = Math.max(maxProduct, currentProduct);
        }
        return maxProduct;
    }
}
