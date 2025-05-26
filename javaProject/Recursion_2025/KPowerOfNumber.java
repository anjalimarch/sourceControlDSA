package Recursion_2025;

public class KPowerOfNumber {

    public static void main(String args [] ){

      long result =   pow( 2,  3 );//X^Y
        System.out.println( result );
}

public static long   pow (int x, int y ){

    if(y==0 ){

       return 1;

    }

   return  pow ( x,  y-1 )*x;




}}
