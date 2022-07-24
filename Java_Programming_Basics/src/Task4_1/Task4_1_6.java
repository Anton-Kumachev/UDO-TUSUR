package Task4_1;

import java.util.Arrays;

public class Task4_1_6 {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Целые чётные числа в этом массиве, которые делятся на 5 без остатка: ");

        boolean a = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 5 == 0 && array[i] != 0) {
                System.out.println(array[i]);
                a = false;
            }
        }

        if (a) {System.out.println("Нет");
        }
    }
}
