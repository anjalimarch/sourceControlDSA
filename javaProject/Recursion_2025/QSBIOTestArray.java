package Recursion_2025;

public class QSBIOTestArray {

    public static void main(String args [] ){


        //Binary search on a strictly increasing array

        int [] a= {6,9,45,67,89,121,896,900,903};
        int [] b= {903,900,896,121,89,67,45,9,6};
       int [] bio= {5,6,7,8,9,10,3,2,1};

         int ind=     binSearch(a, 896 );
         int indDec= binSearchDec(b, 896 );
         int idx= bioTonicNum(bio);
       System.out.println("found ascending index -- "+a[ind]);
       System.out.println("found decending index-- "+b[indDec]);
        System.out.println("found biotonic index-- "+idx+"value"+bio[idx]);

    }

    public static int  binSearch(int [] a, int key )
    {

        int startIndx= 0;
        int endIndx= a.length-1;
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

    public static int  binSearchDec(int [] b, int key )
    {

        int startIndx= 0;
        int endIndx= b.length-1;
        int l= startIndx;
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
