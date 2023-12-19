package DataStructures;

import java.util.Scanner;

public class TestInsertionAndOperation {

    public static void main(String args [] ){
        //insertion
        //every element of the array has to be visited.

//int [] a = new int [6];//{5,6,7,5,3};
        int [] a = new int [5];//{5,6,7,5,3};
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<a.length-1;i++){
            int val = sc.nextInt();

            a[i]= val;

        }
//insert at 3rd postition that is 2nd index .
      //  int postion= 3;
       // printArray(a);
     //   insert( a, postion-1,2);
     //   printArray(a);

        //delete(a, postion-1);
        delete(a,a.length-1);
        printArray(a);
    }


    public  static void  insert (int [] a, int pos,int valToBeInserted){

        for(int i=a.length-2;i>=pos;i--){

               a[i+1]=a[i];




        }
        a[pos]=valToBeInserted;

    }

    public  static void delete(int [] a,int pos){
          pos= a.length-1;
        for(int i=pos; i<=a.length-2;i++){

            a[i]=a[i+1];

        }

    }


    public static void printArray(int [] a){

        for(int data:a){

            System.out.println(data);


        }
    }
}
