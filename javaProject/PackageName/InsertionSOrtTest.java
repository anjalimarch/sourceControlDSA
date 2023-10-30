package PackageName;

public class InsertionSOrtTest {




    public static void main(String args [] ){
        int [] a= {8,4,1,2,1,9};
        insertionSort(a);
        for(int k=0;k<=a.length-1;k++){
            System.out.print(" "+a[k]);

        }

    }


    public  static void insertionSort(int [] a){
        int temp;

        for(int i=1;i<a.length;i++){
            temp =a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                 a[j+1]=a[j];
                 j--;

           }

           a[j+1]=temp;
            }



        }




}



