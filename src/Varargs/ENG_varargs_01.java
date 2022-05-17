package Varargs;

public class ENG_varargs_01 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts more
        than one integer as parameter and prints the sum of integers Method name = sum
        if you call method like that sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
        -->girilen tam sayıların toplamını return eden bır method ceate edın
         */
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        sumNumbers(1,2,3,4,8,9);
    }

    private static void sumNumbers(int... i) {
        int sum=0;

        for (int w:i
             ) {
           sum+=w;
        }
        System.out.println(sum);
    }


}

