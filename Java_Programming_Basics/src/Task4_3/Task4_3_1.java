package Task4_3;

import java.util.ArrayList;

public class Task4_3_1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.remove(1);
        list.remove(Integer.valueOf(3));
        System.out.println(list);
    }
}
