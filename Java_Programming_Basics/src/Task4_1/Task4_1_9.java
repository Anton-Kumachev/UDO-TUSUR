package Task4_1;

import java.util.Arrays;

public class Task4_1_9 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }

        System.out.println(Arrays.toString(array));
        getMaxNumber(array);
    }


    public static int getMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        return max;
    }
}
