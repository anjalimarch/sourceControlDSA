package TaxInt;

import java.util.HashSet;

public class printAlluniqueSubsequencesTest {

    public static void main(String args []){
        HashSet<String> uni = new HashSet<String>();

        String s = "aaa";

        allSubsequence(0, "aaa", "",uni);




    }

    public static   void  allSubsequence(int idx, String s, String newString, HashSet uni){

        if (idx==s.length()){

            if(uni.contains(newString)){
               // System.out.println(uni);
                return;

            }else {
                System.out.println(newString);
                uni.add(newString);
                //System.out.println(uni);
            }
           // System.out.println(uni);

            if(newString==""){
                System.out.println("empty");
            }
            return;



        }

        allSubsequence(idx+1,s, newString+s.charAt(idx),uni);


        allSubsequence(idx+1,s, newString,uni);

    }
}
