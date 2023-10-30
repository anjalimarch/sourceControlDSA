package out.production.javaProject.PackageName;

import java.util.Scanner;

public class FibRecTest {

    public  static void main(String args []){

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        fibRecVal(0, 1, num);


    }

    public static void  fibRecVal(int a, int b , int n){
        int c;
        c= a+b;
        if(c==n){

            a=b;
            b=c;

            System.out.println(c);
          return;

        }


        a=b;
        b=c;
        System.out.println(c);

        fibRecVal(a,b, n);


    }
}
