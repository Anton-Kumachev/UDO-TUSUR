package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа, при условии, что 0 < a < b :");

        int[] array = new int[10];
        System.out.println("Введите число a:");
        int a = sc.nextInt();

        System.out.println("Введите число b:");
        int b = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * ((b + 1) - a)) + a;
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }

        if (a < 0 || a > b) {
            throw new NumberException("Введённое число выходит за допустимые границы условия; 0 < a < b," +
                    "либо не соответвует им .");
        }

        System.out.println("Сгенирированный массив их десяти чисел: " + Arrays.toString(array));
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}

