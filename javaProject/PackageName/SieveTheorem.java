package PackageName;

import java.util.Scanner;

public class SieveTheorem {

    public static void main(String args []){

        System.out.println("printing prime numbers using sieve theorem:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sievePrime(n);


    }


    public static void sievePrime(int n){

        boolean [] b = new boolean[n+1];

        for(int k=2;k<=n;k++){


            b[k]= true;
        }

        for (int i=2;i*i<=n;i++){

          if(b[i]){

            for(int j= i*i;j<=n;j=j+i){
                  b[j]=false;
            }

          }



        }

        for(int a=2;a<=n;a++){
            if(b[a]==true){
                System.out.println("prime number :"+a+" "+b[a]);


            }}


    }
}
