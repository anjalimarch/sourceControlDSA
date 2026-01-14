package assessment2026;

public class TestCompressedString028 {


    //problem

    /*
    * The string should be compressed such that consecutive duplicates of chareacters are replaced with the character
    * and followed by the number of consecutive duplicates
    *   String output = "a3b4c2d3e";
    * */

    public static void main(String args []){

        String input= "aaabbbbccddde";
        String ans= ""+input.charAt(0);

        int count =1;
        for(int i=1; i<input.length(); i++){

             char curr = input.charAt(i);
             char prev= input.charAt(i-1);

             if(curr==prev){

                 count++;
             }else{

                 ans+=count;
                 count=1;
                 ans+= curr;

             }


        }
        ans+=count;

        System.out.println(ans);


      





    }
}
