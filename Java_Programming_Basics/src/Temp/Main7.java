package Temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList <Integer> ();
        //добавление элементов коллекцию
        Collections.addAll(arr,1,2,3,4,5,6,7);
        System.out.println(arr.size());
        //перебор элементов коллекции в цикле
        for (int i=0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        //перебор элементов коллекции в цикле
        for (Integer a: arr) System.out.println(a);

        //перебор элементов коллекции с помощью итератора
        Iterator iter = arr.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
//проверка что коллекция не пустая
        System.out.println(arr.isEmpty());
        //удаление 7го элемента в коллекции
        arr.remove(6);
        //удаление всех элементов коллекции
        arr.removeAll(arr);
        //проверка что коллекция не пустая
        System.out.println(arr.isEmpty());

        Collections.addAll(arr,1,2,3,4,5,6,7);
    /*Разница в том, что вставка через set() затирает старое значение, хранящееся в ячейке.
    А вставка через add() сначала сдвигает все элементы начиная с [index] к концу массива,
    а в образовавшуюся пустую ячейку добавляет нужный тебе объект.
    */
        arr.set(6,8);
        for (Integer a: arr) System.out.print(a);
        //Для преобразования обычного массива в список можно воспользоваться статическим методом addAll() из класса Collections.
        Integer [] a = {1,2,3};
        ArrayList <Integer> arr2 = new ArrayList <Integer> ();
        arr2.add(55);
        Collections.addAll(arr2,a);
        //Статический метод asList() из класса Arrays позволяет «обернуть» список вокруг обычного массива.
        for (Integer t: arr2) System.out.print("\n"+t);
        List<Integer> arr3= Arrays.asList(a);
        System.out.print(arr3.toString());
    }
}
