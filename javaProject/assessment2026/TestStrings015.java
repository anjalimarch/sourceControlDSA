package assessment2026;

import java.util.Scanner;

public class TestStrings015 {



    public static void main (String args []){

         //Scanner sc = new Scanner(System.in);
      //   String str=  sc.next();
        // String strNew= sc.nextLine();
        // System.out.println(str);
      //   System.out.println(strNew);

      String str = "Mishra Anjali";
        int len = str.length();
        System.out.println(len);
        char ch = str.charAt(3);
        System.out.println(ch);
        int idx = str.indexOf('i');
        System.out.println(idx);
       String atr = "Hello";
        String gtr= "Dello";
        System.out.println(atr.compareTo(gtr));
        String name= "Anjali Mishra";
        System.out.println(name.contains("Mis"));
        System.out.println(name.startsWith("Anj"));
        System.out.println(name.endsWith("ra"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String s1= "abc";
        String s2= "def";
        String s3 = s1.concat(s2);

        System.out.println(s1);
        System.out.println(s3);





    }



}
