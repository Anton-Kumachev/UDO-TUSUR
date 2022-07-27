package Task4_4;

//Task 4.1

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять целых чисел с клавиатуры: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, a);
        list.add(1, b);
        list.add(2, c);
        list.add(3, d);
        list.add(4, e);

        System.out.println("Сумма введёных чисел списка: " + Tasks.sum(list));
        Tasks.sort(list);

        System.out.println("Список по возрастанию: " + list);
    }
}
