package Sorting;

public class bubblesortTest {


    public static  void main(String args []){

        int [] a= {4,7,5,2,3,1,6};

        bubbleSort(a);


    }


    public  static void   bubbleSort(int[] a){
        int n = a.length;
        int temp;

      for(int i=0; i<=n-1; i++){

          for(int j= 0; j<=n-2-i;j++){

              if(a[j]>a[j+1]){

                  temp = a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;

              }


          }
      }

      for(int i=0;i<=n-1;i++){
          System.out.print(a[i]+" ");
      }


    }

}
