package assessment2026;

import java.util.Scanner;

public class InsertInArrayTest003 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
      int [] a= createArray(size);
       printArray(createArray(size));
    }

    public static  int [] createArray(int size ){
        Scanner d = new Scanner(System.in);
        int [] k = new int[size];


        for(int i =0; i<k.length;i++) {
            k[i] = d.nextInt();
        }


        return k;

    }



    public static void printArray(int[] a) {

        for (int j = 0; j < a.length; j++) {

            System.out.println(a[j]);

        }


    }

}
