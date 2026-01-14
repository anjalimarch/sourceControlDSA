package assessment2026;

import java.util.Scanner;

public class TestString016 {

    public static void main (String args []){

        Scanner sc =new Scanner(System.in);
        //String newWord = sc.next();


        String str = "abc";
        str = str +"def";
        str+='c';

        System.out.println(str);
        System.out.println("abc"+10+20); //abc1020
        System.out.println("abc"+(10+20)); //abc30
        System.out.println(10+20+"abc"); //30abc left to right



    }




}
