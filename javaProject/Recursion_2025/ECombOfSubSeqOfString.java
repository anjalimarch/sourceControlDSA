package Recursion_2025;

public class ECombOfSubSeqOfString {
    //ABC

    //A, B, C, AB,BC, CA,ABC,ACB

    public static void main(String args []){



        perm("ABC", "");
    }

    public static void perm(String s, String ans){

        if(s.length()==0){

            System.out.println(ans);
           return;
        }

        perm( s.substring(1),ans+s.charAt(0));
       // System.out.println(ans);
        perm( s.substring(1),ans);

    }
}
