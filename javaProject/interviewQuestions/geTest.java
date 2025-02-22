package interviewQuestions;

public class geTest {




    public static void main (String args[]){


        String s1= "silent";
        String s2= "listen";

        boolean result= validate(s1, s2);

        printBool(result);

    }


    public static boolean validate(String a, String b){
        boolean boolflag;
        char [] arrayVal= a.toCharArray();


        for(char find : arrayVal){

            String temp=    String.valueOf(find);

            boolflag= b.contains(temp);

            if(!boolflag)
                return boolflag;
                break;

        }

        return true;


    }


    public static void printBool(boolean flag){


        if(flag){

            System.out.println("string have same chars");


        }

    }
}
