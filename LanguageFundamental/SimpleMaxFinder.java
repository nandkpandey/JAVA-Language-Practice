import java.util.Arrays;

public class SimpleMaxFinder {
    public static void main(String[] args) {
        int[] numbers = { 10, 35, 67, 89, 12, 98, 54 };

        int maxNumber = Arrays.stream(numbers).max().orElseThrow();
        System.out.println("Maximum number: " + maxNumber);
    }
}
