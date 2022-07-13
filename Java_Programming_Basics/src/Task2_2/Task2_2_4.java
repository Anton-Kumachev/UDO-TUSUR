package Task2_2;

public class Task2_2_4 {

    public static void main(String[] args) {
        int age = 15;
        int weight = 25;
        int height = 160;

        System.out.println((age > 13) && (age < 18));
        System.out.println((weight > 23) || (height > 152));
        System.out.println(((weight > 23) || (height > 152)) || !((weight > 23) || (height > 152)));

    }
}