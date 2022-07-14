package Task2_3;

import java.util.Scanner;

public class Task2_3_8 {

    public static void main(String[] args) {

        for (int number = 10; number < 99; number++) {
            int firstNum = number / 10;
            int secondNum = number % 10;

            if (String.valueOf(number).length() == 2 && number > 0 && firstNum % 3 == 0 &&
                    number > 0 && secondNum % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
