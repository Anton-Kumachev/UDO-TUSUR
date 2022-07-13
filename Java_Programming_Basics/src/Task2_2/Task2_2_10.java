package Task2_2;

public class Task2_2_10 {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++)
                System.out.print(j <= i ? j + " " : " " + " ");
            System.out.println();
        }

        for (int k = 4; k >= 0; k--) {
            for (int m = 0; m <= 4; m++)
                System.out.print(k >= m ? m + " ": " " + " ");
                System.out.println();
        }

    }
}