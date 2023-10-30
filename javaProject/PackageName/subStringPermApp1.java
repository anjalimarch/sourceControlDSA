package PackageName;

public class subStringPermApp1 {


    public  static  void perm(String str, String permutation){
        if(str.length()==0){

            System.out.println(permutation);

            return;

        }

        for (int i =0; i<str.length(); i++){

            char currentChar = str.charAt(i);
            String newStr1 = str.substring(0,i);
            String newStr2=  str.substring(i+1);
            String newStr=newStr1+newStr2;
            perm(newStr, permutation+currentChar);
        }

    }
    public static void main (String args[]){

        perm("abc","");
    }
}
