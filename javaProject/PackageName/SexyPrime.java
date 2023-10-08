package PackageName;

import java.util.ArrayList;
import java.util.Scanner;

public class SexyPrime {
//finding prime from 1 to n
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
       int n=  sc.nextInt();

        ArrayList prime= findPrime(n);
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


    public  static ArrayList findPrime(int n ){
        ArrayList a=new ArrayList();
        for(int i=2;i<=n;i++) {
            if (checkPrime(i)) {
                System.out.println("number is prime " + i);

                a.add(i);

            }



        }

        return a;
    }


}
