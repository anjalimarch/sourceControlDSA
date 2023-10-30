package PackageName;

import java.util.Scanner;

public class powerOFStackLogN {



    //x^n


    public static void main (String args []){
        int x, n;

        Scanner sc = new Scanner(System.in);
        n=  sc.nextInt();
        x=sc.nextInt();
        int val= powerOFX(n,x);
        System.out.println(val);
    }


    public static int   powerOFX(int n,int x){
        if(n==0){
            return 1;


        }
        if(x==0){
            return 0;


        }


       if(n%2==0) {
            return  powerOFX(n / 2, x) * powerOFX(n / 2, x);
        }

     else {
          return  x*powerOFX(n / 2, x) * powerOFX(n / 2, x);
        }

        /*
        *     f(4, 2)=2^4
        *
        *     2*f(2)*f(2)
        *      2**2*f(1)*f(1)
        * 2*2*2*2
        *
        *
        *
        * */

    }
}
