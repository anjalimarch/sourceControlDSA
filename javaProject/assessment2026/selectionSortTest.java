package assessment2026;

public class selectionSortTest {

    public static void main (String args []){

        int [] a= {7,4,3,2,6,9};
        printArray(a);
      int [] arr =   selectindSort( a);
        printArray(arr);
    }




    public  static  int [] selectindSort(int [] a){

       int temp = 0;
       for (int i = 0 ; i<a.length-1; i++){

            int indexOfmin = i;

                     for(int j= i+1; j<a.length;j++){
                         if (a[j]<a[indexOfmin]){

                             indexOfmin = j;
                         }
                         temp = a[i];
                         a[i]= a[indexOfmin];
                         a[indexOfmin]= temp;
                     }
       }

        return a;
       }




    public static void printArray(int[] a) {

        for (int j = 0; j < a.length; j++) {

            System.out.println(a[j]);

        }

    }
    }



