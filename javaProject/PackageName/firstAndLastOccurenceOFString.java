package PackageName;

public class firstAndLastOccurenceOFString {

    //first and last occurence of an element in string
    //  abaacdaefaah

    public static void main(String args []){

        String s= "njalimishra";
        occurenceCheck(s,0,s.length()-1, 1);


    }
public static void occurenceCheck(String s, int i, int j,int count){


      if(i==j||i>j){
          System.out.println("on break condition "+count);
         return;

      }
    if(s.charAt(i)==s.charAt(j)) {
        System.out.println("first char " + s.charAt(i) + " " + "last char " + s.charAt(j));
        count=count+1;
        System.out.println(count);
    }



    occurenceCheck(s,i+1, j-1,count);

}

}
