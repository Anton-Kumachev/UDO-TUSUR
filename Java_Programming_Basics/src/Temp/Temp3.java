package Temp;

public class Temp3 {
    public static void main(String[] args) {
        double[] r = new double[100];

        for (int i = 0; i < r.length; i++) {
            r[i] = Math.random() * 100;
            System.out.println(r[i]);
        }
    }
}
