package PackageName;

import java.util.Arrays;

public class XMedianTwoSortedArray {

    public static void main (String args [] ){
        int [] ar1 = {1,3, 8,17};
        int [] ar2 = {5,6, 7,19,21,25};
        int [] m = new int [ar2.length+ar1.length];
        medianTwoSortedArray(ar1, ar2, m);
        printArray(m);


       //O(log(m+n))
    }
    public static int [] medianTwoSortedArray(int[] a, int [] b, int [] m ){
       int i=0, j=0, k=0;
       while (i< a.length && j<b.length)
       {
            if(a[i]<b[j]){

                m[k]=a[i];
                i++;
                k++;


            } else  {
                m[k]=b[j];
                j++;
                k++;
            }

       }

       while (i<a.length){

           m[k]=a[i];
           i++;
           k++;


       }
        while (j<b.length){

            m[k]=b[j];
            j++;
            k++;

        }

        return m;
    }

    public static void  printArray(int [] a){
        for(int c: a){

            System.out.println(c);

        }

    }

}
