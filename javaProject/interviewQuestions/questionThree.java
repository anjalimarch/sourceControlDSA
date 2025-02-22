package interviewQuestions;

import java.util.HashMap;

public class questionThree {

    public static void main(String args []){

        String s= "engineer";
        printoccur(s);

    }

    public static  void printoccur(String s){
        char [] input = s.toCharArray();
        HashMap<Character,Integer> output= new HashMap<Character,Integer>();

        for(char val : input){
            if(output.containsKey(val)){

               output.put ( val,output.get(val)+1);



            }else {
                output.put(val,1);

            }


        }

        System.out.println(output);




    }
}
