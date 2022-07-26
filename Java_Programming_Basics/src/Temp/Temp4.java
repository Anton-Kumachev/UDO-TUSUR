package Temp;

public class Temp4 {
    public static void main(String[] args) {
        double[] list = {-2, 4.5, 5, 1, 2, -3.3};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    /**
     * Сортирует массив методом выбора
     */
    public static void selectionSort(double[] list) {
        for (int i = 0; i <= list.length - 1; i++) {
            // Найти наименьшее значение в list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = list.length - 1; j > i; j--) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Переставить list[i] и list[currentMinIndex], если необходимо
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
