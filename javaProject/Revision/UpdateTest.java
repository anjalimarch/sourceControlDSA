package Revision;

public class UpdateTest {

    public  static void main (String args []){
       int n =5;
       int pos =1;
       int oper=1; // set  if oper =0 --clear


        //set oper
        int bitMask = 1<<pos;
        int newNum;

        if(oper ==1){
            newNum = bitMask|n;

            System.out.println(newNum);
        }else if(oper ==0){

            int notBitMask=~(bitMask);
            newNum = notBitMask & n;



            System.out.println(newNum);

        }



    }
}
