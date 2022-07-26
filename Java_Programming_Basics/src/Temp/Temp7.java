package Temp;

import java.util.ArrayList;
import java.util.Collection;

public class Temp7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("красный");
        list.add("зелёный");
        list.add("красный");
        list.add("зелёный");

        list.remove("красный");

        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        System.out.println(list);
    }
}
