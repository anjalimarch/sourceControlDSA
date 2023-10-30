package out.production.javaProject.PackageName;

public class stackHeightTest {

    //highest memory of stack.
    //x^n =x*x*...ntimes

    public  static  void main (String args []){
       int x=2;
       int n=5;


        System.out.println(x);
        System.out.println(n);

      int result =  calPower(x,n);

        System.out.println("result :"+result);

    }


    public static int calPower(int x , int n ){
        if(n==0){
            return 1;

        }


        int xPownm= calPower(x, n-1);
        int xPown= x*xPownm;
        return  xPown;



    }
}
