package TaxInt;

public class reverseStringRecursion {


    public  static  void main(String args []){
        String input= "MishraAnjali";
        String append="";
        reverseString(input,input.length()-1,append);

    }

    public static void reverseString(String s,int n, String append){


       append= append+s.charAt(n);

        if(n==0){

            System.out.println(append);
            return;


        }
        reverseString( s,n-1, append);





    }
}
