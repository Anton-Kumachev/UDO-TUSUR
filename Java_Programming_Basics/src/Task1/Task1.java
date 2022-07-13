package Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        String name; // переменная для имени
        int years; // переменная для возраста пользователя
        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        System.out.print("Введите ФИО пользователя: ");
        name = input.nextLine();
        System.out.println("Добро пожаловать на курс \"Основы Java-программирования\", " + name + ".");
        System.out.println(name + ", введите свой полный возраст, пожалуйста:");
        years = input.nextInt();
        System.out.println(name + ", Ваш возраст: " + years + " лет.");

    }
}