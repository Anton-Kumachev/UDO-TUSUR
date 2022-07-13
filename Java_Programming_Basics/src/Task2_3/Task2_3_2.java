package Task2_3;

import java.util.Scanner;

public class Task2_3_2 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        number = input.nextInt();

        if(number >= 0) {
            System.out.println("Вы ввели положительное число.");
        } else {
            System.out.println("Вы ввели отрицательное число.");
        }
    }
}
