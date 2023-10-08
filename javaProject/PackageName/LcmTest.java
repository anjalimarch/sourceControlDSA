package PackageName;
import java.util.Scanner;
public class LcmTest {

    public static void main(String args []){

     Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();
       int b= sc.nextInt();
       int product = a*b;
        int lcm =  product /lcmTest(a,b);

        System.out.println("lcm of the numbers :"+lcm);


    }

    public static int lcmTest(int a, int b ){
        int lcm;
        while (a!=0 && b!=0){
            if(a>b){
                a=a%b;
                lcm = a;

            }else{
                b=b%a;
                lcm = b;

            }

            System.out.println("hcf:"+lcm);

        }

        if(a!=0){
            return a;


        }else if(b!=0){
            return b;

        }
        return 1;



    }




}
