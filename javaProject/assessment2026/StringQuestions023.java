package assessment2026;

import java.util.Scanner;

public class StringQuestions023 {



    // toggle all the characters  of the string i.e. to convert Upper case to lower case and vice verso.

    //i/p = Physics
    // o/p = pHYSICS


    public static void main (String args []){

       /// A 65
        //a 97
        // o 48

        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
         //toggle
         //PHysiCs -> phYSIcS

        for(int i =0; i<str.length();i++){


              // check the case is upper of lower

            boolean flag = true;
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int asci = (int)ch;

          //  if (asci<=90) capitial letter

            if(asci>=97) {
                flag = false; //small
            }

            if(flag ==true) {

               //already capital

                asci+= 32; // convert it in to small

                char dh = (char)asci;
                str.setCharAt(i, dh);
            }else{
                // already small

                asci-=32; // convert it in to capital
                char dh =(char)asci;

                str.setCharAt(i, dh);

            }

        }

        System.out.println(str);


    }




}
