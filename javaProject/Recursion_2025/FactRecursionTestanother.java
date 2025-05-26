package Recursion_2025;

public class FactRecursionTestanother {

public  static void main (String args []){

 int result = func(4);


System. out.println(result );
}
static int func(int n){
    if (n==1 || n==0 ) {

        return 1;

    }

    return n  * func(n-1);









}


}
