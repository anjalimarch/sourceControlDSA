package interviewQuestions;

public class TestQue {

    public static void main(String args []){
        String s1= "earth";
        String s2="herat";

       boolean result=  charCheck(s1, s2);
      // printResult(result);

    }

    public  static  boolean charCheck(String s1, String s2){

        boolean val=true ;
      // boolean present;
       char [] a=   s1.toCharArray();
       char [] b=  s2.toCharArray();

       for (char find: a){

          String op=  String.valueOf(find);
          val = s2.contains(op);
          if(val==false)
              break;


       }

      if (val== true)
           return true;
      else
          return false;

    }

    public static void printResult(boolean val){

        if (val== true)
             System.out.println(val);
        else
            System.out.println(val);


    }
}



