package PackageName;

import java.util.Scanner;

public class FactTestRecursion {

    public static void main(String args []){

        Scanner s = new Scanner(System.in);
      int num=   s.nextInt();
//  functionFact(num);
        int fact =1;

        functionFact(num,fact);





    }


    public  static  void functionFact(int n,int fact){


       // while (n>0){
            if(n==0){
                System.out.println(fact);
               return;


            }

            fact = fact*n;
            functionFact(n-1,fact);
         //   n--;

     //   System.out.println(fact);
      //  }




    }
}
