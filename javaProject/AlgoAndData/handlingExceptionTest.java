package AlgoAndData;

import java.util.Scanner;

public class handlingExceptionTest {

    public static void main (String args []){

        int [] a = new int [3];
        Scanner sc = new Scanner(System.in);
        a[0]=11;
        a[1]=78;
        a[2]=23;

//        for (int i=0;i<a.length;i++){
//
//            a[i]=sc.nextInt();
//        }
        System.out.println("index of array");
        int index = sc.nextInt();

        System.out.println("deviding the number with :");

        int number = sc.nextInt();
        try{
         //  int getarray= a[index];
            System.out.println("value at particular index  :"+a[index]);
          // int devideArray =  a[index]/number;
            System.out.println("deviding the value at particular index:"+a[index]/number);

        }catch (ArithmeticException e){

            System.out.println("Some ArithmeticException exception occured "+e);



        }catch (ArrayIndexOutOfBoundsException e ){

            System.out.println("Some ArrayIndexOutOfBoundsException exception occured "+e);

        }catch (Exception e){

            System.out.println("Some  exception occured "+e);

        }


    }
}
