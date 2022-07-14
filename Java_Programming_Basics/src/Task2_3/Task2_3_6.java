package Task2_3;

import java.util.Scanner;

public class Task2_3_6 {

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите десять целых чисел по очереди: ");
        int countPositivNum = 0;
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            if (num > 0 ) {
                countPositivNum++;
            }
        }
        System.out.println("Положительных чисел было введено: " + countPositivNum);
    }
}
