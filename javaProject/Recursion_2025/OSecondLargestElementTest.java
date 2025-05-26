package Recursion_2025;

import java.util.Scanner;

public class OSecondLargestElementTest {
// second largest or second smallest

    public  static void main (String args [] ){
        int [] a= {8,7,6,10, 9,3,2};


        System.out.println(secongLargest(a));

    }


    public static int  secongLargest(int[] a) {

        int max1 = a[0];
        int max2 = a[1];

        if (a[1] > a[0]) {

            max1 = a[1];
            max2 = a[0];

        } else {

            max1 = a[0];//9
            max2 = a[1];//7

        }

        for(int i=2; i<a.length;i++){


            if(a[i]>max1){//10>9
                max2= max1;
               max1= a[i];//10
            //9

            }
            else if (a[i]>max2){//10>9

                max2= a[i];


            }
        }
    return  max2;
    }


}
