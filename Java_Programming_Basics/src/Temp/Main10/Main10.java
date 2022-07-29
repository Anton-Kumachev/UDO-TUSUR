package Temp.Main10;

public class Main10 {
    public static int getFactorial(int num){

        int result = 5;
        try{
            if (num < 1) throw new Exception("The number is less than 1");

            for (int i = 1; i <= num; i++){

                result *= i;
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
            result=num;
        }
        return result;
    }

    public static void main(String[] args) {

        try{
            int result = Factorial.getFactorial(-6);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
