package Task4_1;

import java.util.Arrays;

public class Task4_1_4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));
    }

    public static int[] getArray() {
        int[] evenArray = new int[10];

        for (int i = 0; i < evenArray.length; i++) {
            int numbers = (int) (Math.random() * 100);
            if (numbers % 2 == 0 && numbers != 0) {
                evenArray[i] = numbers;
            } else {
                numbers = numbers + 1;
                evenArray[i] = numbers;
            }
        }
        return evenArray;
    }
}
