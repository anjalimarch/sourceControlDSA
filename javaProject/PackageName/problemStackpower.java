package PackageName;

import java.util.Scanner;

public class problemStackpower {


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
        if(n<=0){
           return 1;


        }


        return  x* powerOFX(n-1,x);

    }
}
