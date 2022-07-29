package Temp;

public class Temp11 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 4 / a;
            System.out.println("a" + a);
            try { // вложенный блок try
                if (a == 1 ) a = a / (a - a); // деление на ноль
                if (a == 2 ) {
                    int c[] = {1};
                    c[4] = 99;
                }
            }
            // здесь генерируется исключение в связи
            // с выходом за пределы массива
            catch (ArrayIndexOutOfBoundsException е) {
                System.out.println("Индeкc за пределами массива:" + е);
            }
        }
        catch(ArithmeticException е) {
            System.out.println("Дeлeниe на ноль:" + е);
        }
    }
}
