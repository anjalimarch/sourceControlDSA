package PackageName;

public class printAllSubsequencesTest {

    public static void main(String args []){

        String s = "abc";

        allSubsequence(0, "abc", "");




    }

 public static   void  allSubsequence(int idx, String s, String newString){

  if (idx==s.length()){
      System.out.println(newString);
      if(newString==""){
          System.out.println("empty");
      }
      return;


  }

     allSubsequence(idx+1,s, newString+s.charAt(idx));


     allSubsequence(idx+1,s, newString);

 }
}
