package Temp;

public class Temp15 {private static boolean test() {
    boolean flag = false;

    try{
        return true;
    }
    catch(Exception e){}
    finally{}

    System.err.println("Outside try-catch-finally");
    return flag;
}


    public static void main(String[] args)  {

        System.out.println(test());
    }
}