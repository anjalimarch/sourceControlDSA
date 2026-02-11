package assessment2026.Recursion;

public class RecursionTest {


   static  void printFibo(int n, int a, int b  ){
       if(n==0){

           return;


       }

       int c = a+b;

       System.out.println(c);
       printFibo(n-1, b, c );
   }

   static  int printXpowerN(int x, int n ){

       if(n==0){ //base case 1

           return 1;

       }


       if(x==0){ //base case 2

           return 0;

       }


       int xPow1= printXpowerN( x,  n-1 );

       int xPow= x*xPow1;

       return xPow;



   }


    static  int prinCalPower(int x, int n ){

        if(n==0){ //base case 1

            return 1;

        }


        if(x==0){ //base case 2

            return 0;

        }

        if(n%2==0) {

            return prinCalPower(x, n / 2) * prinCalPower(x, n / 2);

        }else{

            return prinCalPower(x, n / 2) * prinCalPower(x, n / 2) *x;


        }






    }

    static void towerOfHanoi(int n , String src , String helper, String dest ){

       if(n==1){

           System.out.println("Transfer disk"+n+"from"+ src+" "+dest);

           return;


       }


        towerOfHanoi( n-1 , src , dest, helper);

        System.out.println("Transfer disk"+n+"from"+ src+" "+dest);

        towerOfHanoi( n-1 , helper, src, dest);


    }




    public static void main (String args [] ){
        int a=0; int b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFibo(n-2, a,b);
        int ans=     printXpowerN( 2,5);
        System.out.println(ans);

        int updans = prinCalPower(2,6);
        System.out.println(updans);

        towerOfHanoi(3, "A", "B", "C");







    }
}
