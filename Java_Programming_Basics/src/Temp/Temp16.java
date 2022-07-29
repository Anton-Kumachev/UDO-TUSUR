package Temp;

public class Temp16 {
    static int sum(int a, int b) {
        try { return a + b; }
        finally { return 0; }
    }

    public static void main(String args[]){

        System.out.print(sum(1, 2)); }


}
