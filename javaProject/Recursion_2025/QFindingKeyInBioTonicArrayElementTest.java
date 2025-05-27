package Recursion_2025;

public class QFindingKeyInBioTonicArrayElementTest {

    public static void main(String args [] ){


        //Binary search on a strictly increasing array


       int [] b= {5,6,7,8,9,10,3,2,1};
        int idx= bioTonicNum(b);
         int ind=     binSearch(b, 2 ,idx);
         int indDec= binSearchDec(b, 2 ,idx);

     /*  System.out.println("found ascending index -- "+b[ind]);
       System.out.println("found decending index-- "+b[indDec]);
        System.out.println("found biotonic index-- "+idx+"value"+b[idx]);*/
        System.out.println(ind);
        System.out.println(indDec);

    }

    public static int  binSearch(int [] a, int key, int idx )
    {

        int startIndx= 0;
        int endIndx= idx-1;
        int l= startIndx;
        int h= endIndx;
        int mid;

        while (l<h){


             mid = (l+h)/2;

             if(key ==a[mid]){

                 return mid;

             }
            else if (key >a [mid] ){

                l= mid +1;


            }else{

                h= mid -1;

            }


        }
        return -1; // match not found



    }

    public static int  binSearchDec(int [] b, int key, int idx )
    {

        int startIndx= 0;
        int endIndx= b.length-1;
        int l= idx+1;
        int h= endIndx;
        int mid;

        while (l<h){


            mid = (l+h)/2;

            if(key ==b[mid]){

                return mid;

            }
            else if (key >b[mid] ){

                h= mid -1;


            }else{


                l= mid +1;
            }


        }
        return -1; // match not found



    }

  public static  int bioTonicNum(int [] bio){

        int l= 0;
        int h= bio.length-1;
        while (l<=h){


          int   mid =(l+h)/2;

          if (bio[mid]>bio[mid-1]&& bio[mid]>bio[mid+1]){

              return mid;
          }else if(bio[mid]>bio[mid-1]&& bio[mid]<bio[mid+1]){

              l= mid;

            } else{

               h= mid;

            }

        }


      return -1;
  }

}
