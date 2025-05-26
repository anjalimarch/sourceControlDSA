package Recursion_2025;

public class FactRecursionTest {

public  static void main (String args []){

 func(4, 1 );



}
static void func(int n, int f  ){

   if (n==1 ) {
       System. out. println("factorial is "+ f );
      return;

   }


    f= f*n;
    func(n-1, f);


}


}
