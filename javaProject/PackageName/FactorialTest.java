package PackageName;

import java.util.Scanner;

public class FactorialTest {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("entering the number:");

        int num=sc.nextInt();
        System.out.println("print factorial number:");
        int c =  findFactorial(num);
        System.out.println("factorial of the number: "+c);


    }


    public static int findFactorial(int num){

        int fact=1;
        while(num>=1){





            fact = num *fact;
            System.out.println("num:"+num);
            num--;


        }
        return  fact;
    }
}
