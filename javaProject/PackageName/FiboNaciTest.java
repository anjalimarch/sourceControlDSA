package PackageName;

import java.util.Scanner;

public class FiboNaciTest {

    //0 1 1 2 3 5 8

    public static  void main (String args []){
      int sum,a , b, n ;
      Scanner s = new Scanner(System.in );
      n= s.nextInt();

        fiboNaci(n);

    }

    public  static void fiboNaci(int n ){
        int a, b, c;
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<=n;i++){

            c =a+b;
            a=b;
            b=c;

            System.out.println(c);
        }


    }

}
