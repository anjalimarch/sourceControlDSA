package assessment2026;

public class PalindromicSubstring026Test {

    public static boolean isPalindromic(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;

        }
        return true;


    }

    public static void main(String args[]) {

        String str = "abbd";
        int count=0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {


                if(isPalindromic(str.substring(i, j))==true){
                      System.out.println(str.substring(i,j)+" ");
                      count++;


                } else  {

                    System.out.println("Not a palindrome--"+str.substring(i,j)+" ");

                }


            }


        }
        System.out.println("the number of palindromic substrings "+ count);
    }
}
