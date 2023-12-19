package DataStructures;

public class BinarySearchTest {


    public static void main (String args []){



        int [] a= {2,8,14,32,66,100,104,200,400};// not sorted
        int x= 200;
        binarySearch( a,  x,0, a.length-1);

    }
    public static void binarySearch(int [] a, int x,int low, int high){

        int mid = calMid(low, high);
        while(x!=a[mid]){


        if(x>a[mid]){

            low=mid;
          //  high=high;
           mid =  calMid(low, high);

        }else {

          //  low=low;
            mid=high;
            mid =   calMid(low, mid);
        }


    }
    System.out.println("index of the element"+mid+"--"+a[mid]);
    }

    public static int calMid(int low, int high){

        int mid= (low+high)/2;
        return mid;

    }




    public static void printArray(int [] a){
     for(int i=0;i<a.length;i++){



        System.out.println("found "+a[i]);




}

}

}
