package Task4_1;

public class Task4_1_2 {
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        int arrayLength = numbers.length;
        double a = ((double) sum / (double) arrayLength);
        System.out.println(a);
    }
}