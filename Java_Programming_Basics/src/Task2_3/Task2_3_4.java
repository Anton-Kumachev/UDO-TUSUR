package Task2_3;

import java.util.Scanner;

public class Task2_3_4 {

    public static void main(String[] args) {
        double a, b, c;
        double D; //переменная дискриминант

        System.out.println("Это программа для решения квадратного уравнения, вида: a * x^2 + b * x + c = 0");
        System.out.println("Введите по очереди коэффициенты квадратного уравнения (a, b, c):");

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        D = b * b - 4 * a * c;

        if(D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни квадратного уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет корней!");
        }
    }
}
