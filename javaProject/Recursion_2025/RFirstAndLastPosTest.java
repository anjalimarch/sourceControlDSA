package Recursion_2025;

public class RFirstAndLastPosTest {

    public static void main(String args [] ){


        //Binary search on a strictly increasing array


        //int [] b= {2,6,12,18,21,26,33,42};
        //  int [] b= {2,6,12,18,21,26,26,26,33,42};
        int [] b= {2,4,4,4,4,4,4,4};
        int [] res= {-1, -1};
        int first=binSearch(b, 4, res );
        int last = binSearchBackwards(b, 4, res );



        System.out.println("position of first element-- "+first+"position of last element--"+last);

        // System.out.println(simpCaseCount+"Duplicate "+count+" dup followed by not found case "+countNotFound);

    }

    public static int  binSearch(int [] a, int key, int [] res)
    {

        int startIndx= 0;
        int endIndx= a.length;
        int l= startIndx;
        int h= endIndx;
        int mid=0;

        while (l<=h){


            mid = (l+h)/2;

            if(key ==a[mid]){
                res[0]=mid;

                h= mid-1;

            }
            else if (key >a [mid] ){

                l= mid +1;


            }else{

                h= mid -1;

            }


        }

        return res[0];



    }


    public static int  binSearchBackwards(int [] a, int key, int [] res)
    {

        int startIndx= 0;
        int endIndx= a.length;
        int l= startIndx;
        int h= endIndx;
        int mid=0;

        while (l<=h){


            mid = (l+h)/2;

            if(mid<a.length&&key ==a[mid] ){
                res[1]=mid;

                l= mid+1;

            }
            else if (mid<a.length && key >a [mid] ){

                l= mid +1;


            }else{

                h= mid -1;

            }


        }

        return res[1];



    }

}

