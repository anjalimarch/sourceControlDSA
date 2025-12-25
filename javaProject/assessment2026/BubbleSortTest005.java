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
        for (int i = 0 ; i<a.length-1; i++){// first element will e remaining in passes

        for (int j=0 ; j<a.length-1-i; j++)// in every pass elements will  be removed from behind to compare.
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
