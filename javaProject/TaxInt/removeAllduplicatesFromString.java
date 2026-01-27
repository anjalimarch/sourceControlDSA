package TaxInt;

public class removeAllduplicatesFromString {

    public  static boolean [] mapping = new boolean[26];
    public static void main(String args []){

        String s= "abbccda";


        removeAllDuplicates(s,0,"");

    }




    /* ascii values
    * 'a' = 97
'b' = 98
'c' = 99
...
'z' = 122

    *
    *
    *
    * */

  public static void  removeAllDuplicates(String s, int i, String newString){

        if(i==s.length()){
            System.out.println(newString);
            return;

        }
          char curr= s.charAt(i);
        if(mapping[curr-'a']==false) {
            mapping[curr - 'a'] = true;
            removeAllDuplicates(s, i + 1, newString + s.charAt(i));
        }
      if(mapping[curr-'a']==true)
      {
          removeAllDuplicates(s,i+1, newString);
    }}
}
