package Revision;

import java.awt.*;

public class BitMaskTest {

    public static void main (String args []){


        System. out.println("Bit Mask operation -- Get Bit");

           int n =5;
           int pos =3;
           int bitMask = 1<<pos;
           int newNum= bitMask & n;
           System.out.println("new Number :"+newNum);
            if((bitMask & n )==0){

                 System.out.println("bit was zero");

            }else {

                System.out.println("Bit was one ");
            }





    }
}
