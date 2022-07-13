package Task2_3;

import java.util.Scanner;

public class Task2_3_3 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое двузначное число: ");
        number = input.nextInt();

        int lengthNum = String.valueOf(number).length(); //Определение количествоа знаков в числе

        if(lengthNum == 1 || lengthNum > 2) { //Отрицательные числа не учитывал, в задании сказано только про двузначные числа,
                                              //считаем, что "минус" это уже третий знак
            System.out.println("Вы ввели некорректное число.");
            return;
        }

        int firstNum = number / 10;
        int secondNum = number % 10;

        int sumNum = firstNum + secondNum;
        int multiplyNum = firstNum * secondNum;

        if (multiplyNum > sumNum) {
            System.out.println("Произведение цифр числа больше, чем их сумма.");
        } else {
            System.out.println("Сумма цифр числа больше, чем их произведение.");
        }

    }
}
