package AlgoAndData;

public class NestedTryCatchTest {

    public static void main (String args []){

        int [] a = new int [3];
        a[0]=45;
        a[1]=67;
        a[2]=99;


          try {

              System.out.println("nested try: "+a[2]);

              try {

                  System.out.println("nested try: ");
                  System.out.println(a[2]/0);

              }catch (ArrayIndexOutOfBoundsException e){


                  System.out.println("Array--IndexOutOfBoundsException in level 2: "+e);
              }

          }catch (Exception e){


              System.out.println("Exception in level 1: "+e);
          }
    } 
}
