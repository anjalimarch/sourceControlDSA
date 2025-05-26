package Recursion_2025;

public class SumTestNum {

    public static void main (String args []){


        fun( 243, 0);
    }

    public static int fun(int n,  int s){
        if(n<=0){

          System.out. println(s);
            return 0;


        }

        int r;
        r=n%10;
        n= n/10;

        s= r+s;
        fun( n,   s);
       return s;


    }
}
