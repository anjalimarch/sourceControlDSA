package PackageName;

import java.util.Scanner;

public class Divisors {

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        divisor(n);

    }

    public static void divisor(int n ) {
        int i = 0;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {

                System.out.println(i);


            }}

            for (; i > 1; i--) {

                if (n % i == 0) {

                    System.out.println(n / i);

                }


            }


        }
    }
