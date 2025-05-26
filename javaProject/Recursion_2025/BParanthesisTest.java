package Recursion_2025;

public class BParanthesisTest {


    public  static void main (String args []){
    char [] a= new char[4];
    parant(a, 2, 0, 0, 0);



    }
   public static  void  parant(char [] a, int n, int op, int cl, int i){


        if(i==a.length){

            System.out.println(a);

            return ;

        }

        if(op<n) {
            a[i] = '(';
            parant(a, n, op + 1, cl, i + 1);
        }
       if(cl<op) {
           a[i] = ')';
           parant(a, n, op, cl + 1, i + 1);
       }
    }




}
