package Task4_2;

public class Tasks {
//Task1.1
    public static void getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Максимальное значение в массиве равно: " + max);
    }

//Task 1.2
    public static void getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Минимальное значение в массиве равно: " + min);
    }

//Task 1.3
    public static int[] sortArr(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minNum = array[i];
            int minNumIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (minNum > array[j]) {
                    minNum = array[j];
                    minNumIndex = j;
                }
            }
            if (minNumIndex != i) {
                array[minNumIndex] = array[i];
                array[i] = minNum;
            }
        }
        return array;
    }

//Task 1.4
    public static int[] sortReserv(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minNum = array[i];
            int minNumIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (minNum < array[j]) {
                    minNum = array[j];
                    minNumIndex = j;
                }
            }
            if (minNumIndex != i) {
                array[minNumIndex] = array[i];
                array[i] = minNum;
            }
        }
        return array;
    }

}





