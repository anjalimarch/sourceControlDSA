package assessment2026;

public class MergeSortTest008 {

    public static void main (String args [] ){
        //int [] a = {44,11,8,7,45,76,45,54};
        int [] a = {6,4,5,3};

        mergeSort(a,  0, a.length-1);
       printArray(a);
    }

    public static void mergeSort(int [] a, int low, int high){
        if (low>= high ){
            for (int val:a) {

                //      System.out.println(val);

            }

            return;


        }

        int mid = (low +high)/2;
        mergeSort(a,  low, mid);
        mergeSort(a,mid+1, high);
        merge (a, mid, low, high);




    }

    public static void merge(int [] a, int mid, int low, int high){
          int i, j, k ;
        int [] b =new int [100];
        i= low;
        j = mid +1;
        k = low;

        while (i<=mid && j<=high){

            if(a[i]<a[j]){

                b[k]= a[i];
                i++;
                k++;

            }else{


                b[k]= a[j];
                j++;
                k++;
            }


        }

        while (i<=mid ){
            b[k]= a[i];
            k++;
            i++;

        }

        while (j<=high ){
            b[k]= a[j];
            k++;
            j++;

        }

        for(int s = low; s<=high ; s++){


            a[s]= b[s];
        }



    }


    public static void printArray(int[] a) {

        for (int j = 0; j < a.length; j++) {

            System.out.println(a[j]);

        }

    }



}
