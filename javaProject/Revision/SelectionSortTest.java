package Revision;

public class SelectionSortTest {
    public static void main(String args []){


        int [] a= {7,4,5,2,9,11};

        for (int i =0; i<a.length-1;i++){

            int smallest = i;

            for (int j= i+1;j<a.length;j++){


                if(a[smallest]>a[j]){

                    smallest= j;
                }
            }

            int temp = a[smallest];
            a[smallest]= a[i];
            a[i]= temp;





        }


        for (int k=0;k<a.length;k++){
            System.out.println("array post selection sort :"+a[k]);

        }


    }
}
