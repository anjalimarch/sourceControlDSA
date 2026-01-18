package assessment2026;

public class BubbleSortTest005 {


    public  static void main (String args [] ){
        int temp=0;
        int [] a= {55,78,34,645,21,64,66};
        bubbleSort(a);
        printArray(a);

    }

    public static void bubbleSort(int [] a){
          int temp =0;
        for (int i = 0 ; i<a.length-1; i++){// first element will be remaining in passes- n-1 elements ko laga dia to bacha hua hoga apni jageh per number of passes

        for (int j=0 ; j<a.length-1-i; j++)
            // i=0, for 1st pass n-1 comparision,
            // i=1. for second pass n-2 comparision
            // i=2, for third pass n-3 comparision,
            // // n-i-1 in every pass elements will  be removed from behind to compare. For comparision in each pass.
        {


            if (a[j]>a[j+1]) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;

            }




        }


    }


    }

    public static void printArray(int[] a) {

        for (int j = 0; j < a.length; j++) {

            System.out.println(a[j]);

        }

    }


}
