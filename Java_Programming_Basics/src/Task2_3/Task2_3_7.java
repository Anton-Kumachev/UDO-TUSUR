package Task2_3;

import java.util.Scanner;

public class Task2_3_7 {

    public static void main(String[] args) {
        int number, sum = 0, multiply;

        Scanner input = new Scanner(System.in);

        System.out.println("Вводите целые числа по очереди, пока программа не закончит своё выполнение: ");

        number = input.nextInt();
        multiply = number * number;

        while (sum < multiply) {
            number = number + 1;
            sum = sum + number;

            System.out.println(number);
        }
    }
}
