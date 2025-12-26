package assessment2026;

public class QuickSortTest007 {

    public static  void main (String args []){

        int [] a = {567, 234, 678,123,789,342,111};
        int n = 7;
        printArray(a);
        quickSort(a,0,n-1);
        printArray(a);


    }

   public static void quickSort(int [] a, int low, int high){

         int partitionIndex ; //index of pivot after partiion

         if(low<high) {
            partitionIndex = partition(a, low, high);
            quickSort(a, low, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, high);
          }

   }

   public  static int partition(int [] a, int low , int high){
          int pivot = a[low];
          int i = low+1;
          int j = high;
       while (i<j) {
        while (a[i] <= pivot && i<high) {

            i++;


        }

        while (a[j] > pivot) {


            j--;


        }
        if (i < j) {


            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }

    };
       int temppivot = a[low];
       a[low]= a[j];
       a[j]= temppivot;


       return j;
   }

    public static void printArray(int[] a) {

        for (int j = 0; j < a.length; j++) {

            System.out.println(a[j]);

        }

    }

}
