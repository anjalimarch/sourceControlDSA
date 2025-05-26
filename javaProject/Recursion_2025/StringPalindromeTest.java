package Recursion_2025;

public class StringPalindromeTest {

    public  static  void main(String args[]){

        String s= "KatK";
        palindrome(s, s.length(),"");

    }

    public static boolean palindrome(String s, int i, String rev){
        if(i==0 && !s.equals(rev)){

            System.out.println("Sring is not a palindrome");

            return  false;
        }


        if(i==0 && s.equals(rev)){

            System.out.println("Sring is palindrome");

            return  true;
        }


        rev=  rev+s.charAt(i-1);
        i=i-1;

        palindrome( s, i, rev);
     return  false;
    }
}
