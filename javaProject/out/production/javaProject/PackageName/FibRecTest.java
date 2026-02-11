package out.production.javaProject.PackageName;

import java.util.Scanner;

public class FibRecTest {

    public  static void main(String args []){

       // Scanner s = new Scanner(System.in);
       // int num = s.nextInt();
        int num = 7;

        fibRecVal(0, 1, num-2);


    }

    public static void  fibRecVal(int a, int b , int n){

        if(n==0){



          return;

        }
        int c;
        c= a+b;


        System.out.println(c);

        fibRecVal(b,c, n-1);


    }
}
