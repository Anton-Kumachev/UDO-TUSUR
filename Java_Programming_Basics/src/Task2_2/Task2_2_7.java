package Task2_2;

public class Task2_2_7 {

    public static void main(String[] args) {
        int range_count = 10;
        int for_count = 0;
        int n = 0;

        for (int i = for_count; i <= range_count; i++) {
            n++;
            if (n >= for_count || n <= range_count) {
               System.out.println("\'Шаг=\'," + i);
            }
        }
    }
}