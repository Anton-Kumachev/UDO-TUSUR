package Temp;

//посчитать сумму элементов массива

public class Main1 {
    public static void main (String[] args) {
        int[] array1 = new int[3];

        array1[0] = 5;
        array1[1] = 17;
        array1[2] = 350;

        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
            System.out.println(array1[i]);
        }
            System.out.println("Сумма - " + sum);
    }
}


