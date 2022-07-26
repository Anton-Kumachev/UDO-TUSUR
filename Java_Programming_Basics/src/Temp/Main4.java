package Temp;

//многомерные массивы

public class Main4 {
    public static void main(String[] args) {
       int[][] a = {
               {1, 2, 3},
               {4, 5, 6, 9},
               {7},
       };
        System.out.println("Количество строк: " + a.length);
        System.out.println("Длина ряда № 1: " + a[0].length);
        System.out.println("Длина ряда № 2: " + a[1].length);
        System.out.println("Длина ряда № 3: " + a[2].length);
    }
}
