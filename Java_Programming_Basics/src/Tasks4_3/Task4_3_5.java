package Tasks4_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять чисел с клавиатуры: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();

        ArrayList<Double> list = new ArrayList<>();
        list.add(0, a);
        list.add(1, b);
        list.add(2, c);
        list.add(3, d);
        list.add(4, e);

        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list) {
       double sum = 0;
       for (int i = 0; i < list.size(); i++) {
           sum += list.get(i);
       }
       return sum;
    }
}
