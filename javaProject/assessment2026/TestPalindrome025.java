package assessment2026;

public class TestPalindrome025 {

    public static void main (String args []){

       // String str = "abcdca";
        String str = "aba";
        int i =0;
        int j= str.length()-1;

        while (i<j){

            if(str.charAt(i)!=str.charAt(j)){

                System.out.println("Not a palindrome");
                break;

            }else{

                System.out.println(" a palindrome");


            }
            i++;
            j--;


        }


    }
}
