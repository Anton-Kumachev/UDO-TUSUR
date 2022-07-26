package Temp;

//найти максимальный и минимальный элемент

public class Main3 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (n + 1) +1);
            System.out.print(array[i] + " ");
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

        System.out.println("\nМаксимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
