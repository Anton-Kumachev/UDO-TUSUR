package Temp;

//несимметричные массивы

public class Main5 {
    public static void main(String[] args) {
        int[][] a1 = new int[5][]; // Двумерный массив с двумя строками
        a1[0] = new int[1];
        a1[1] = new int[2];
        a1[2] = new int[3];
        a1[3] = new int[4];
        a1[4] = new int[5];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
