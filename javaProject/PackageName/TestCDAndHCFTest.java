package PackageName;

import java.util.Scanner;

public class TestCDAndHCFTest {


    public static void main(String args[]){

        System.out.println("find greatest common divisor: and HCF");
        Scanner sc = new Scanner(System.in);
        int   a = sc.nextInt();
         int  b = sc.nextInt();

//euclids theorem modified version
          int hcf=    testHCF(a,b);

          System.out.println("hcf of two numbers :"+hcf);




    }


    public static int testHCF(int a, int b) {
        int hcf;

        while (a!=0 && b!=0) {

            if (a > b) {


                a = a % b;
             //   hcf = a;

            } else {


                b = b % a;
          //      hcf = b;


            }



        }

        if(a!=0){
            return a;


        }else if(b!=0){
            return b;

        }
    return 1;
    }




}
