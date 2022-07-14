package Task2_3;

import java.util.Scanner;

public class Task2_3_5 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        number = input.nextInt();

        for (int i = 0; i < 10; i++) {
            number = number + 1;
            System.out.println(number);
        }
    }
}
