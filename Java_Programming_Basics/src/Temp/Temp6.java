package Temp;

import java.util.ArrayList;
import java.util.Arrays;

public class Temp6 {
    public static void main(String[] args) {
        String[] array = {"красный", "зеленый", "синий"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        list.add(0, "red");
        System.out.println(list);
    }
}
