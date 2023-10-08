package PackageName;

import java.util.Scanner;

public class PrimeTest {

    public  static void main(String args[]){

        System. out. println("Hello World Java ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean prime = checkPrime(n);
        System.out.println(prime);



}

    public static boolean checkPrime(int n){
        int i;
        if(n==1){
          return false;


        }
        if (n==2|| n==3){

         return true;
        }

        if(n%2==0 ||n%3==0){

           return false;

        }
    for (i= 5;i*i<=n;i=i+6){
          if(n%i==0||n%(i+2)==0){


              return false;



          }



    }
        return  true;

    }

}
