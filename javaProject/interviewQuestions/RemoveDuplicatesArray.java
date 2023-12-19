package interviewQuestions;

import java.util.Scanner;

public class RemoveDuplicatesArray {



    public static void main(String args [] ){
        //insertion
        //every element of the array has to be visited.


        int [] a = {3,4,5,5,5,6,7};


        printArray(a);


        removeDuplicates(a);
     //   printArray(a);
    }




public static void removeDuplicates(int []a){

        int j= 0;

        for(int i=1;i<a.length;i++){

            if(a[j]!=a[i]){

             j++;



            }
            a[j]=a[i];
        }
    for(int i=0;i<=j;i++){

        System.out.println(a[i]);


    }

}


    public static void printArray(int [] a){

        for(int i=0;i<=a.length-1;i++){

            System.out.println(a[i]);


        }
    }
}
