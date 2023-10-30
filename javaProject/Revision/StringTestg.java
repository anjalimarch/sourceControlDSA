package Revision;

import java.util.Scanner;

public class StringTestg {

    public static void main (String args []){
/*
        System.out.println("entering string values in java");
         String name = "Tony";
         String fullName = "Tony Stark";

        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.println("your name is :"+name);

        //concat
        String finalName = fullName+ name;

        System.out.println(finalName);

      int len= finalName.length();
      System.out.println(len);


      for(int i=0; i<len; i++){

          System.out.println(finalName.charAt(i));


      }



      */


  String name = "Tony";
  String lastName = "Tony1";

  if(name.compareTo(lastName)==0){
      System.out.println("equal");

  }
        if(name.compareTo(lastName)>0){

            System.out.println("name is greater than lastname");
        }
        if(name.compareTo(lastName)<0){
            System.out.println("lastname is greater than name");

        }

   if(new String("Tony")==new String("Tony")){
    System.out.println("equals");
// always use compare to for string object


   }

    }
}
