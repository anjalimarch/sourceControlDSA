package PackageName;

import java.util.Scanner;

public class NumberOfZeroTestInFactorialTest {

    public static void main(String args []){
        int c,num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        c= findZeroInFactorial(num);
        System.out.println("number of zeros "+c);


    }



    public static int  findZeroInFactorial(int num){

        int res = 0;
        int powerOffive = 5;
      while(num>=powerOffive) {

          res = res + num / powerOffive;
          powerOffive = powerOffive * 5;
      }
      return res;

    }

}
