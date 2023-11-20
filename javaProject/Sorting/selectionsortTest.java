package Sorting;

public class selectionsortTest {



    public static void main(String args[]) {
        int[] a = {5, 4, 6, 7, 2, 1};
        insertionSort(a);

    }

    public static void insertionSort(int[] a) {

        int min;
        int im;
        int temp;
        for (int i = 0; i < a.length; i++) {
            im = i;
            min = a[im];
            for (int j = i + 1; j < a.length; j++) {

                if (min > a[j]) {


                    min = a[j];
                    im = j;
                  //  System.out.println(im);


                }
            }


            temp = a[i];
            a[i] = a[im];
            a[im] = temp;
        }
        for (int i = 0; i < a.length; i++) {
          System.out.println(a[i]);
        }
    }
}