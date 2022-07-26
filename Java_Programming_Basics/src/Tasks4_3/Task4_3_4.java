package Tasks4_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4_3_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять чисел с клавиатуры: ");
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

        sort(list);
        System.out.println(list);
    }
    public static void sort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (min > list.get(j)) {
                    min = list.get(j);
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }
    }
}
