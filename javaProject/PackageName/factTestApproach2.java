package PackageName;

import java.util.Scanner;

public class factTestApproach2 {

    public static  void main (String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

         int factValue=  calFact(n);
         System.out.println(factValue);



    }

    public  static  int calFact(int n){

        if(n==1||n==0){

            return 1;


        }

        int factorialValue= n*calFact(n-1);
        return  factorialValue;

    }
}
