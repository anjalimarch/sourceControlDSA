package assessment2026;

public class InsertionSort006 {
    public static void main (String args []){

       int [] a = {7,9,23,5,2,1};
      int [] k =  insertTest(a);
        printArray(k);

    }

public static int [] insertTest(int [] a){
   int key=0, j=0;
    for (int i =1; i<=a.length-1; i++){

        key = a[i];

         j= i-1;

         while(j>=0 && a[j]>key){

           a[j+1] = a[j];

             j--;
         }

          a[j+1]=key;

    }





   return  a;
}




    public static void printArray(int[] a) {

        for (int j = 0; j < a.length; j++) {

            System.out.println(a[j]);

        }
}

}
