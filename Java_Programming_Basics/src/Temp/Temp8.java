package Temp;

import java.util.ArrayList;
import java.util.List;

public class Temp8 {
    public static void main(String []args){
        List<String> list = new ArrayList();
        list.add("Hello");
        for (Object str : list) {
            System.out.print(str);
        }
    }
}
