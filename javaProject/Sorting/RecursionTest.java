package Sorting;

import java.util.Scanner;

public class RecursionTest {
public static void main (String args []){
    Scanner s = new Scanner(System.in);
    int number = s.nextInt();
    printNumber(number);

}
public static void printNumber(int n ){

    if(n<=0)
        return ;
    System.out.println("number n "+n);
    printNumber(n-1);
    System.out.println("printing number n "+n);


    }

}
