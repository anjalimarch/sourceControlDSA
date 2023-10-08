package PackageName;

import java.util.Scanner;

public class PrimeFactiorsTest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        primeFactors(n);

    }

    public static void primeFactors(int n) {
        int i = 2;

        while (i*i<=n) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            i++;
        }
      //  System.out.println(n);
       if(n>1){


          System.out.println(n);
      }


    }
}
