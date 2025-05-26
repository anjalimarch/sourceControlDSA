package Recursion_2025;

public class CCombinationPhoneTest {
    //problem stmt
    //input= 846
    //output = tgm, tgn, tgo,thm, thn, tho, tim,tin, tio
   //ugm, ugn, ugo,uhm, uhn, uho, uim,uin, uio
    //vgm, vgn, vgo,vhm, vhn, vho, vim,vin, vio
    public  static  void main (String args []){


        possibleWords("846", " ");


    }

    public static void possibleWords(String s, String ans){
        String [] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(s.length()==0){
            System.out.println(ans);
            return;


        }
         String key=  keypad[s.charAt(0)-48];
for(int i=0;i<key.length();i++){
        possibleWords(s.substring(1),ans+key.charAt(0));
        possibleWords(s.substring(1),ans+key.charAt(1));
       possibleWords(s.substring(1),ans+key.charAt(2));

    }}
}
