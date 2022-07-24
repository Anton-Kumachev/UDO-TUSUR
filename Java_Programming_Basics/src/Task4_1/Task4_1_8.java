package Task4_1;

import java.util.Arrays;

public class Task4_1_8 {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        getArray(array);
    }
    public static void getArray(int[] array) {
        boolean a = true;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] != 0)
                a = true;
            else {
                a = false;
                count++;
            }
        }

        if (a = true && count == 00)
            System.out.println("Массив состоит из положительных чисел");
        else
            System.out.println("Не все числа в массиве положительные.");
    }
}