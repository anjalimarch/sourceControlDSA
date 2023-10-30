package out.production.javaProject.PackageName;

import java.util.Scanner;

public class FibTestRecApp2 {
public  static  void main (String args [])

{

   int a, b;
   a= 0;
   b=1;


    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    System.out.println(a);

    System.out.println(b);
   fibNaci(0, 1, n-2);



}

public  static  void fibNaci(int a , int b,int  n){

    if(n==0){

        return;
    }


    int c = a+b;
    System.out.println(c);

    fibNaci(b,c , n-1);
}

}
