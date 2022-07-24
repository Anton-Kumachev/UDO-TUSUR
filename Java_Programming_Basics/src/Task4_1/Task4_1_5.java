package Task4_1;

import java.util.Arrays;

public class Task4_1_5 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));
    }

    public static int[] getArray() {
        int[] oddArray = new int[10];

        for (int i = 0; i < oddArray.length; i++) {
            int numbers = (int) (Math.random() * 100);
            if (numbers != 0 & numbers % 2 != 0) {
                oddArray[i] = numbers;
            } else {
                numbers = numbers + 1;
                oddArray[i] = numbers;
            }
        }
        return oddArray;
    }
}
