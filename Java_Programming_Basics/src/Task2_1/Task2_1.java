package Task2_1;

import java.util.Scanner;

import static java.lang.Math.ceil;

public class Task2_1 {

    public static void main(String[] args) {
        double radius;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        radius = input.nextDouble();

        area = 3.14159 * radius * radius;

        System.out.println("Площадь круга равна: " + ceil(area));
    }
}
