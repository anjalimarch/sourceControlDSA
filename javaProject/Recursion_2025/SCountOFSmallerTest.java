package Recursion_2025;

public class SCountOFSmallerTest {

    public static void main(String args [] ){


        //Binary search on a strictly increasing array


       //int [] b= {2,6,12,18,21,26,33,42};
     //  int [] b= {2,6,12,18,21,26,26,26,33,42};
        int [] b= {2,6,12,18,21,25,33,42};

         int ind=     binSearch(b, 26 );
         int simpCaseCount= ind+1;


        System.out.println(ind);

  // System.out.println(simpCaseCount+"Duplicate "+count+" dup followed by not found case "+countNotFound);

    }

    public static int  binSearch(int [] a, int key )
    {

        int startIndx= 0;
        int endIndx= a.length;
        int l= startIndx;
        int h= endIndx;
        int mid=0;

        while (l<=h){


             mid = (l+h)/2;
            if ( a[mid]>key)

            {


               break;
            }
             if(key ==a[mid]){
                 while (mid+1<a.length && key==a[mid+1])

                 {

                     mid ++;

                 }

                 return mid;

             }
            else if (key >a [mid] ){

                l= mid +1;


            }else{

                h= mid -1;

            }


        }

        if(a[mid]>key){

             return mid;
        }else{

            return mid+1; // match not found
        }




    }

}
