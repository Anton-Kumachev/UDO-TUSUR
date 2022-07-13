package Task2_2;

public class Task2_2_3 {

    public static void main(String[] args) {
        int x = 1;

        System.out.println(!(x > 0) && (x > 0));
        System.out.println((x > 0) || (x < 0));
        System.out.println((x != 0) || (x == 0));
        System.out.println((x >= 0) || (x < 0));
        System.out.println((x != 1) == !(x == 1));
    }
}