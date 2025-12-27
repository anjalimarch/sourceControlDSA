package assessment2026;

public class LinearSearchTest {

    public static void main (String args []){
        int [] a= {12,13,33,34,54,67,89};
    //   boolean val=  linearSearch(a, 54);
        int indexValue=  binarySearch(a, 54);
        printIndex(indexValue);

       // binarySearch(a);



    }



    public static boolean linearSearch(int [] a, int num ){

       for(int i=0; i<a.length; i++){


           if (a[i]==num){

               return true;

           }

       }

      return true;
    }

    public static int binarySearch (int [] a, int num ){
       int low = 0;
       int high = a.length-1;





          while (low<=high){

              int mid = (low+ high)/2;
              if(a[mid]==num){

                  return mid;

              }

              if(num>a[mid]){

                  low = mid+1;



              } else {

                  high= mid-1;

              }







      }

return -1;
    }



    public static void printvalue(boolean result) {



            System.out.println("element is present "+"which is "+result);



    }


    public static void printIndex (int result) {



        System.out.println("element is present "+"at index "+result);



    }
}
