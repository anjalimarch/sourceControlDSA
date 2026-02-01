package assessment2026.selenium.java;

import java.util.*;

//Q16: Capitalize first letter of each word

public class JavaStringQuestions {
   public static boolean [] m = new boolean[26];


    static int countVowel(String s){
        int vol=0;
        for(char c : s.toLowerCase().toCharArray()){


            if("aeiou".indexOf(c)>=0){

                vol++;


            }

        }

        return  vol;


    }

    static boolean chekPalindrom(String s){
        int j = s.length()-1;
        int i =0;

        while(i<j){
           if (s.charAt(i)!=s.charAt(j)){


               return  false;

           }

           i++;
           j--;



        }

        return true;


    }


    static boolean checkPalinwithoutpoin(String s ){

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();

        if (s.equals(rev)){

            return true;

        }


        return false;

    }

    static String removeDupFromString(String s){


        StringBuilder sb = new StringBuilder();

        Set h = new HashSet();

        for(char c : s.toCharArray()){


            if(h.add(c)){

                sb.append(c);



            }









        }

        String news = sb.toString();
        return news;





    }


    static  void  removeDupWithoutSB(String s, int i, String news){

        if (i==s.length()){

            System.out.println(news);
            return ;
        }




        char curr= s.charAt(i);

        if(m[curr-'a']==false){
            m[curr-'a']=true;
            removeDupWithoutSB(s, i+1, news+s.charAt(i));



        }

        else if ( m[curr-'a']=true){

            removeDupWithoutSB(s, i+1, news);

        }






    }


    static Map<String, Integer> countSubStringoccur (String s ){

        String [] b = s.split(" ");
        Map <String, Integer>m = new HashMap();
        for(String c : b){
            if(!m.containsKey(c)){
               m.put(c, 1);



            }else{


                m.put(c, m.get(c) + 1);
            }
                //m.put(c, m.getOrDefault(c, 0) + 1);

        }

        return m;
    }


    static String revString(String s){
        String newS= " ";

        for(int i = s.length()-1; i>=0; i--){

            newS= newS+s.charAt(i);

        }
        return newS;


    }


    static String revStringR(String s, int j, String newS){


        if(j<0){

            System.out.println(newS);
            return newS ;

        }

       return revStringR(s, j-1, newS+s.charAt(j));


    }

    //start from 16 try covering all string questions tomorrow.


    static  String captilizeFirstLetterOfeachWord(String [] input){

        String finans=" ";
        for(String a: input){

           Character c=Character.toUpperCase(a.charAt(0));
                String rem=   a.substring(1);

                finans= finans+c+rem+" ";


        }

     return finans;
    }



    static boolean checkOnlyDigit(String s){


      return   s.matches("\\d+");


    }

    static  String findLongest(String [] input ){
        String longest= "";

        for(String a: input){

           if (a.length()>longest.length()){

               longest=a;


           }



        }

        return longest;


    }

    static boolean isAnagramCheck(String s1, String s2){
        if(s1.length()!=s2.length()){

            return false;

        }


      String in =  s1.toLowerCase();
       String out = s2.toLowerCase();

       int [] x = new int[26];


       for (int i=0; i<in.length(); i++){


           x[in.charAt(i)-'a']++;
           x[out.charAt(i)-'a']--;


       }


       for(int y: x){

           if(y!=0){

               return false;

           }


       }

        return true;

    }


    static int findNonRepeating(int [] in) {

        HashMap<Integer, Integer> m = new LinkedHashMap<>();

        for (int i : in) {

            if (!m.containsKey(i)) {

                m.put(i, 1);


            } else {

                m.put(i, m.get(i) + 1);


            }


        }


        for(Map.Entry<Integer, Integer> e: m.entrySet()){

            if(e.getValue()==1){


                return e.getKey();

            }



        }

        return  -1;
    }


    static  String  reverseEachWordInASentence(String words){

      String [] c =   words .split(" ");
      String ans = " ";


      for (String s : c ){

            StringBuilder news = new StringBuilder(s);
            String rev = news.reverse().toString();
            ans = ans +rev+" ";

      }

      return ans;

    }

   // String str = "I am an online educator";
    static  String  reverseEachWordInUsingAppend (String words){

           String ans="";
            StringBuilder sb = new StringBuilder("");
            for(int i =0; i<words.length();i++){

                char ch = words.charAt(i);

                if(ch!=' '){

                    sb.append(ch);
                }else{
                      sb.reverse();
                      ans+=sb;
                      ans+=" ";

                    sb = new StringBuilder("");


                }



              }

        sb.reverse();
        ans+=sb;
        return ans;

        }


    static boolean checkBalanceParanthesis(String s ){


        Stack<Character> st= new Stack();

        for(char ch:s.toCharArray()){

            if(ch=='('|| ch=='{'||ch=='['){

                st.push(ch);
            }
            else{

                if (st.isEmpty()) // what if never pushed the left ones
                    return false;

                char top = st.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;




            }





        }

        return st.empty();


    }



    public static void main (String args [] ){

        String s = "Automation";
       // countVowel(s);
        System.out.println(countVowel(s));

        String input = "level";
        String name = "rudransh";
        String str = "I am an online educator";
        String bal = "{[()]}";
        String balVal= ")]}";
        chekPalindrom(input);
        checkPalinwithoutpoin(input);

        System.out.println(   chekPalindrom(input));
        System.out.println(    checkPalinwithoutpoin(input));
       //System.out.println(    removeDupFromString(name));

       removeDupWithoutSB(name,0,"");

       String ss= "test automation test";

       Map<String, Integer>m1= countSubStringoccur(ss);
        System.out.println(    m1);

       // System.out.println(    revString(s));

        revStringR(s, s.length()-1, " ");
        String words = "anjalio mishra is a geek and senior manager pochu";

        String [] a = words.split(" ");

        System.out.println(    captilizeFirstLetterOfeachWord(a));

       // if  string contains only digits

        String onlyDigit = "124";

        System.out.println(    checkOnlyDigit(onlyDigit));
        //longest word in a sentence
        System.out.println(    findLongest(a));

    // increase the count w.r.t characters
        String s1="Silent";
        String s2= "Listen";
       // isAnagramCheck(s1,s2);

        System.out.println(    isAnagramCheck(s1,s2));
        //find first non repeating
        int [] nonIn = {78,45,78,32,34,32,45,64};




        System.out.println(    findNonRepeating(nonIn));
        System.out.println(    reverseEachWordInASentence(words));

        System.out.println(     reverseEachWordInUsingAppend(str));
        checkBalanceParanthesis(bal);
        checkBalanceParanthesis(balVal);


        //extract tions


        String f = "Test123Result45";
        System.out.println(f.replaceAll("\\D", ""));
        String g = "TestCase123";
        System.out.println(g.matches("[a-zA-Z0-9]+"));






    }



}
