package Temp;

import java.util.HashSet;
import java.util.Set;

public class Temp9 {
    public static void main (String args[]) {
        {
            try {
                int a = 30, b = 0;
                int c = a/b;
                System.out.println ("Result = " + c);
            }

            catch(ArithmeticException e) {
                System.out.print ("error");
            }
            finally{
                System.out.println("all");
            }
        }
    }
}