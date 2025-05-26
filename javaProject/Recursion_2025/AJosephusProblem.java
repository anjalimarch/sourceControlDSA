package Recursion_2025;

public class AJosephusProblem {


    public static void main (String args[]){
       jos(7,3);


    }

public static int jos(int n,int k) {


    if(n==1){


        System.out.println(k);
         return 0 ;
    }

    return (jos(n-1, k)+k)%n;




}}




