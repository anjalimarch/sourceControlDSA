package Revision;

public class OperatorTestSetBit {
    public static void main (String args []){
       int n = 5;
       int pos =1;
       int bitMask = 1<<pos;
       int newNum = bitMask|n;
       System.out.println("newNum--"+newNum);
       if((bitMask|n)==0){


           System.out.println("Bit was zero");



       }else {


           System.out.println("Bit was one");
       }

    }

}
