package Recursion_2025;

public class NSpanOfArray {
    // span of an array
    //  (max- min )
    public static void main(String args[]) {

        int[] a = {7, 10, 5, 6, 0, 3, 4, 8};

       System.out.println(spanArray(a));

    }

    public static int spanArray(int[] a) {
           int span = max(a)-min(a);
        return span;

    }

    public static int min(int[] a) {

        int min = a[0];

        for (int c = 1; c < a.length; c++) {

            if (a[c] < min) {

                 min = a[c];


            }
        }

    return  min;
    }

    public static int max(int[] a) {

        int max = a[0];

        for (int c = 1; c < a.length; c++) {

            if (a[c] > max) {

                max = a[c];


            }

        }
      return max;

    }




}
