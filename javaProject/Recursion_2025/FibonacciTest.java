package Recursion_2025;

public class FibonacciTest {

    public  static void main (String args []){


    fib(1,1, 1);

    }

   static void  fib(int a, int b, int res){


        if (a==1 && b==1){


            System.out.println(a);
            System.out.println(b);
        }

        if(res ==34){
          //  System.out.println("fib series"+res);
            return ;
        }

        res = a+b;
       System.out.println("fib series"+res);
        fib(b, res, res);

    }
}
