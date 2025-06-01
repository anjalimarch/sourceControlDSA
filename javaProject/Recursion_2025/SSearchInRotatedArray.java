package Recursion_2025;

public class SSearchInRotatedArray {

    public static void main (String args[]){
      //search in rotated sort array

        int [] a= {1,2,4,5,6,7,8};
        int [] r= {4,5,6,7,8, 1,2};
        int rotatedIndex = 2;
       int sub= a.length-rotatedIndex;
       int result=   binSearch(r,0,sub-1, 7 );
      int resultForSecondHalf=   binSearch(r,sub,r.length-1 ,7);
      System.out.println(result+"result of the index"+resultForSecondHalf);


}

public static int binSearch(int [] r, int l, int h, int key ){
        int mid ;
        while (l<=h){

            mid = (l+h)/2;
           if(key ==r[mid]){

               return mid;
           } else if (key>r[mid]) {

               l= mid+1;


           }else {

               h= mid-1;
           }

        }



return -1;


}





}
















