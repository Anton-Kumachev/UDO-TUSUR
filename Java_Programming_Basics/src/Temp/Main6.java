package Temp;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            a = (int)(Math.random() * 21) - 10;
            if (a % 2 == 0) {
                array[i] = a;
            } else array[i] = a + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.println("\nОтсортированный массив \n");
        for (int e : array) {
            System.out.print(e + " ");
        }
    }
}
