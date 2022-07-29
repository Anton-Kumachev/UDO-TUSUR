package Temp;

public class Temp12 {
    public static void main(String[] args) {
        int a = 4;
        try {
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.err.println("Произошла недопустимая арифметическая операция");
        }

        finally {
            System.out.println("Блок finally");
        }
        System.out.println("Программа завершена");
    }
}
