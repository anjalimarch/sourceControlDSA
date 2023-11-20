package TaxInt;

public class removeAllduplicatesFromString {

    public  static boolean [] map = new boolean[26];
    public static void main(String args []){

        String s= "abbccda";


        removeAllDuplicates(s,0,"");

    }

  public static void  removeAllDuplicates(String s, int i, String newString){

        if(i==s.length()){
            System.out.println(newString);
            return;

        }
          char curr= s.charAt(i);
        if(map[curr-'a']==false) {
            map[curr - 'a'] = true;
            removeAllDuplicates(s, i + 1, newString + s.charAt(i));
        }
      if(map[curr-'a']==true)
      {
          removeAllDuplicates(s,i+1, newString);
    }}
}
