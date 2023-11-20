package TaxInt;

public class printAllKeypadCombinationsTest {


    public static String[] keypad= {
            ".",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tu",
            "vwx",
            "yz"

    };


    public  static void printCombination(String s, int idx, String combination){

        if(idx==s.length()){

            System.out.println(combination);
            return;


        }
        char currChar=s.charAt(idx);
        String mapping =keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){

            printCombination(s,idx+1,combination+mapping.charAt(i));

        }

    }
    public static void main(String args []){
        String s="23";
        printCombination(s,0,"");
    }

}
