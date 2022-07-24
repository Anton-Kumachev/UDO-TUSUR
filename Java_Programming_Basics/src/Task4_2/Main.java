package Task4_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[] {4, 9, 3, 2, 5, 18, 21, 7, 11, 15, 5, 17 };

        Tasks.getMax(x);
        Tasks.getMin(x);
        System.out.println(Arrays.toString(Tasks.sortArr(x)));
        System.out.println(Arrays.toString(Tasks.sortReserv(x)));
    }
}
