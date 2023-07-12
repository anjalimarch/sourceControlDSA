package PackageName;

import java.util.Scanner;

public class countDigitsInNumber {
    public static void main(String args[]){

           int d,num;
           Scanner sc = new Scanner(System.in);
           System.out.println("input number:");
           num =sc.nextInt();


            d=   countDigitsInNumber(num);
           System.out.println("number of digit:"+d);

    }


    public  static int countDigitsInNumber(int n) {
        int c = 0;
        while (n > 0) {
            int r = n % 10;
            c = c + 1;
            System.out.println("count:" + c + "digits:" + r);
            n = n / 10;
        }
       return  c;
    }


}
