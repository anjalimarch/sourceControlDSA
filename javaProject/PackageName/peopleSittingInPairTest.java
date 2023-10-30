package PackageName;

public class peopleSittingInPairTest {


    public static void main(String args []){
               int n= 4;
            int pair = f(n);


            System.out.println(pair);

    }

    public  static  int f(int n){

        if(n<=1){

            return 1;



        }

        return  f(n-1)+(n-1)*f(n-2);


    }
}
