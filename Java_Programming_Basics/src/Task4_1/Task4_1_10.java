package Task4_1;

import java.util.Arrays;

public class Task4_1_10 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(getArray(array)));
    }

    public static String[] getArray(int[] array) {
        int countZero = 0;
        int countPositiveNum = 0;
        int countNegativeNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                countZero++;
            if (array[i] > 0)
                countPositiveNum++;
            if (array[i] < 0)
            countNegativeNum++;
        }

        String[] newStringArray = new String[3];

        newStringArray[0] = "Отрицательные значения в массиве встретились " + countNegativeNum + " раз";
        newStringArray[1] = "Положительные значения в массиве встретились " + countPositiveNum + " раз";
        newStringArray[2] = "Ноль в массиве встретился " + countZero + " раз";

        return newStringArray;
    }
}
