package interviewQuestions;

public class ValidStringProblem {


    public static void main(String args []){
      String s = "alice and  bob are playing stone-game10";
       // Input: sentence = "alice and  bob are playing stone-game10";
        //Output: 5

       int op= countValidWords(s);
        System.out.println(op);

    }



        public static int countValidWords(String sentence) {
            String regex = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
            String r2 = "[^0-9]+";
            String[] arr = sentence.split("\\s+");
            int ans = 0;
            for(String s: arr)
            {
                if(s.matches(regex) && s.matches(r2))
                {
                    ans++;
                    //System.out.println(s);
                }
            }
            return ans;
        }




    /*Part	Pattern	Description
    Start & End	^ ... $	Ensures the entire string matches from beginning to end.
    The Word	([a-z]+(-?[a-z]+)?)?	Matches a word consisting of lowercase letters.
- Letters	[a-z]+	Matches one or more lowercase letters.
            - Optional Hyphen	(-?[a-z]+)?	Optionally matches a single hyphen followed by more letters.
            Punctuation	(!|\.|,)?	Optionally matches exactly one punctuation mark: !, ., or ,.*/

}

