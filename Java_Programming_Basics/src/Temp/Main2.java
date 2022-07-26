package Temp;

//поделить массив на четные и нечетные

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
       int n = 10;
       int[] mas1 = new int[n];
       int evenNums = 0;
       int oddNums = 0;

        for (int i = 0; i < n; i++) {
            mas1[i] = (int)(Math.random() * (n + 1) + 1);
            if (mas1[i] % 2 == 0) {
                evenNums++;
            } else oddNums++;
        }

        System.out.println(Arrays.toString(mas1));
        int[] mas2 = new int[evenNums];
        int[] mas3 = new int[oddNums];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < n; i++) {
            if (mas1[i] % 2 == 0) {
                mas2[index1] = mas1[i];
                index1++;
            } else {
                mas3[index2] = mas1[i];
                index2++;
            }
        }
            System.out.println("чётные" + Arrays.toString(mas2));
            System.out.println("нечётные" + Arrays.toString(mas3));
    }
}
