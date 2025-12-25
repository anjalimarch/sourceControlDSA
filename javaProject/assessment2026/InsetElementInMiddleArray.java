package assessment2026;

import java.util.Scanner;

public class InsetElementInMiddleArray {

    public static void main (String args [] )
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] a=  createArray(size+1);


        printArray( a);
       inserAnElement(a, sc.nextInt(),sc.nextInt(),size);

        printArray( a);
        deleteAnElement(a,sc.nextInt(),size);

      //  printArray(a);


    }


    public  static int [] inserAnElement(int [] a, int index , int value,int size ){

        for (int i =size; i >=index; i--){

            a[i]= a[i-1];

        }
        a[index]=value;
     return a;
    }


    public static void  deleteAnElement(int [] a, int index,int size ){


        for(int j= index; j<size; j++){

            a[j]= a[j+1];



        }
        size=size-1;

        for(int j=0; j<=size;j++){

            System.out.println(a[j]);

        }
    }

    public static  int [] createArray(int size ){
        Scanner d = new Scanner(System.in);
        int [] k = new int[size];


        for(int i =0; i<k.length-1;i++) { // one empty space
            k[i] = d.nextInt();
        }


        return k;

    }

/*

    public static  int [] createArray(int [] k){



        for(int i =0; i<k.length-1;i++) { // one empty space
            k[i] = i+90;
        }


        return k;

    }

*/


    public static void printArray(int [] a){

        for(int j=0; j<a.length;j++){

            System.out.println(a[j]);

        }

    }




}
