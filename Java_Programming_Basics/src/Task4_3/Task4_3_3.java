package Task4_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4_3_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять чисел с клавиатуры, закончите цифрой 0: ");
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

        System.out.println("Максимальное значение в списке: " + max(list));
    }
    public static Integer max(ArrayList<Integer> list) {
        int max = 0;
        if (list.size() == 0 || list.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
        }
        return max;
    }
}
