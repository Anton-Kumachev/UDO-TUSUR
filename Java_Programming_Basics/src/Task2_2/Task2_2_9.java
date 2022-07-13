package Task2_2;

public class Task2_2_9 {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--)
                System.out.print(j <= i ? j + " " : " " + " ");
                System.out.println();
        }
    }
}