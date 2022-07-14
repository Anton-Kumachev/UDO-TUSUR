package Task2_3;

import java.util.Scanner;

public class Task2_3_9 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое положительно трёхзначное число: ");
        number = input.nextInt();

        int lengthNum = String.valueOf(number).length(); //Определение количествоа знаков в числе

        if (number < 0 || lengthNum == 1 || lengthNum == 2 || lengthNum > 3) {
            System.out.println("Вы ввели некорректное число.");
            return;
        }

        int firstNum = number / 100;
        int secondNum = number / 10 % 10;
        int thirdNum = number % 10;
        int count = 1;

        if (firstNum == secondNum && secondNum == thirdNum)
            count += 2;

        if (firstNum == secondNum && secondNum != thirdNum)
            count++;

        if (firstNum == thirdNum && secondNum != thirdNum)
            count++;

        if (secondNum == thirdNum && secondNum != firstNum)
            count++;

        if (firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum)
            count = 0;

        System.out.println("Количество одинаковых чисел в трёхзначном числе: " + count);
    }
}
