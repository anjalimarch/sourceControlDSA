package Recursion_2025;

public class HSubsetSumTest {


    public static void main(String args []){
        int [] a= {10, 20, 15, 5 };
        int sum = 25;
      int result  =   subSetSum(a, sum, 0);

      System.out.println(result);
    }

    public static  int subSetSum(int [] a , int sum, int i ){
        if(sum <0){
            return 0;


        }

        if(sum ==0){
            return 1;


        }

        if(i ==a.length)

        {

         return 0;

        }

        return subSetSum( a, sum- a[i], i+1)+ subSetSum(a, sum, i+1);




    }
    }

