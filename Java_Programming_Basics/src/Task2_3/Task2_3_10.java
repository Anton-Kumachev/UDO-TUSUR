package Task2_3;

import java.util.Scanner;

public class Task2_3_10 {

    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Пожалуйсита, введите любое число: ");
        num = input.nextInt();
        int numModern;
        if (num < 0) {
            numModern = num * (-1);
            System.out.println("Число после модернизации равно: " + numModern);
        } else if (num >= 0) {
            numModern = num * 0;
            System.out.println("Число после модернизации равно: " + numModern);
        }
    }
}