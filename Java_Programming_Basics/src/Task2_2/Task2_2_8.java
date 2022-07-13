package Task2_2;

public class Task2_2_8 {

    public static void main(String[] args) {
        int range = 0;
        int for_count = 0;
        int n = 0;

        for (int item  = range; item <= 30; item++) {

            System.out.println("\'Шаг=\'," + item);

            if (item == 5 ) {
                System.out.println("\'Item =\'," + item);
            }
            if (item == 10 ) {
                System.out.println("\'Item =\'," + item);
            }
            if (item < 4 ) {
                System.out.println("\'Item <\'," + item);
            }
            if (item >= 25 ) {
                System.out.println("\'Item <\'," + item);
            }
        }
    }
}