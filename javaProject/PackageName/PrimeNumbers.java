package PackageName;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = isprimeNumber(n);

        System.out.println("number is prime or not: "+ check);

    }

    public static boolean isprimeNumber(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
          if(n%i==0) {
              return false;
          }
            else {
              return true;

          }
//sexy prime number
// cousins prime numbers
// time complexity




    }
        return false;
}
}
