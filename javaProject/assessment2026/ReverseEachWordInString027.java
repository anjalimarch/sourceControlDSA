package assessment2026;

public class ReverseEachWordInString027 {


    public static void main (String args []){


        //problem reverse each word of the string
        // input = "I am an educator"
        //output = "I ma na rotacude"


           String str = "I am an online educator";
           String ans = "";
           StringBuilder sb = new StringBuilder("");
           for(int i =0; i<str.length(); i++){
              char ch =str.charAt(i);
              if(ch!=' '){

                   sb.append(ch);

              }else{
                  sb.reverse();
                   ans+=sb;
                   ans+=" ";
                   //empty sb
                 // sb.delete(0,sb.length());
                  //or
                  sb = new StringBuilder("");


              }

           }
        System.out.println(sb);

           sb.reverse();
           ans+=sb; // ans = ans+sb

      System.out.println(ans);

    }



}
