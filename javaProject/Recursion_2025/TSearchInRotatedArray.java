package Recursion_2025;

public class TSearchInRotatedArray {

    public static void main (String args[]){
      //search in rotated sort array

        int [] a= {7,8,1,2,4,5,6};


       int result=   binSearch(a,0,a.length-1, 8 );

 System.out.println(result);


}

public static int binSearch(int [] a, int l, int h, int key ){
        int mid ;
        while (l<=h){

            mid = (l+h)/2;
           if(key ==a[mid]){

               return mid;
           } else if (a[l]<=a[mid]) { //check for left
               if(key>=a[l]&& key<a[mid]) {
                   h= mid - 1;
               } else {

                  l=mid+1;
               }

          }
           //right sorted portion
           else{
               if(key>=a[mid]&& key<a[h]){

                   l=mid+1;
               }else{

                   h= mid-1;

               }
           }


    }



return -1;


}





}
















