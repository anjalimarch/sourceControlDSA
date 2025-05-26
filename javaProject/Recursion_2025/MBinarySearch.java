package Recursion_2025;

import java.util.Arrays;

public class MBinarySearch
{
    public static  void main (String args []) {


        //int[] a = {50, 10, 33, 40, 26, 52,55,66, 90,12,11,4,100};
        int[] a = {2,5,8,10,11};
       // Arrays.sort(a);
        binarySearch(a, 5);

    }

    public  static int binarySearch(int [] a, int key ){



        int low=0;
        int high=a.length-1;

        while (low<=high){
            int mid = (low +high )/2;
            if(key==a[mid]){


                System.out.println(key);

                return mid;
            }

            if (key<a[mid]){


                high= mid-1;

            }

            if(key> a[mid]){

                low = mid+1 ;

            }


        }
          return -1;
        }







}







