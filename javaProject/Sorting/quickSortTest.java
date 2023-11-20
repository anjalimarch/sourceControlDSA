package Sorting;

public class quickSortTest {

public  static void main (String args []){

            int [] inputArray= {2,4,3,9,1,4,8,7,5,6};
             int n= 10;
            printArray(inputArray);
            quickSort(inputArray,0,n-1);

            printArray(inputArray);

}

public  static  void printArray(int []a){
    for (int b: a){

        System.out.println("print array"+b);

    }





}

public static int partition(int [] a, int low, int high){

    int pivot= a[low];
    int i = low+1;
    int j= high;

    int index;




    while(i<j){

    while (a[i]<=pivot && i<high){
        i++;


    }
    while ( a[j]>pivot){

        j--;

    }


    if(i<j){


        swap( a, i, j);


    }

    };



        swap( a, low, j);
        index=j;

      return index;
    }





    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

public static void quickSort(int [] a,int low , int high) {
    if (low<high) {
        int partitionIndex;//index of pivot after partition
        partitionIndex = partition(a, low, high);
        quickSort(a, low, partitionIndex - 1);
        quickSort(a, partitionIndex + 1, high);

    }
}
}
