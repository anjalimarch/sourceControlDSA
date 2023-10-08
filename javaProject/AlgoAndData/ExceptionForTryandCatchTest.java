package AlgoAndData;

import java.awt.desktop.SystemSleepEvent;

public class ExceptionForTryandCatchTest {

    public static void main(String args []){


          int a=60000;
          int b= 0;

          try {
              int c = a/b;
              System.out.println(c);
          }catch (Exception e){

              System.out.println("We failed to divide reason: "+e);
          }





    }
}
