package Task4_1;

import java.util.Arrays;

public class Task4_1_7 {

    public static void main(String[] args) {
        int[] array = new int[20];
        int numbers = 0;

        for (int i = 0; i < array.length; i++) {
            boolean a = true;
            while (a) {
                numbers = (int) (Math.random() * 20 - 10);
                if (numbers >= (-10) && numbers != 0 && numbers <= 10) {
                    array[i] = numbers;
                    a = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}