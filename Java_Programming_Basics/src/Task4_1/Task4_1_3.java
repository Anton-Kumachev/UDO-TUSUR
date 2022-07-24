package Task4_1;

import java.util.Arrays;

public class Task4_1_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));
    }
    public static int[] getArray() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
