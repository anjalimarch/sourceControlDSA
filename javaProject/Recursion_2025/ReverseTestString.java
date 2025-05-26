package Recursion_2025;

public class ReverseTestString {

    public static void main (String args []){

        String s= "anjali";
        int len = s.length();

        String rev="";

        fun(s,len,rev);


    }

    public  static void fun(String s, int i,String rev){

        if(i==0){

            System.out.println(rev);
            return;
        }


        rev=  rev+s.charAt(i-1);
        i=i-1;

        fun( s, i, rev);



    }
}
