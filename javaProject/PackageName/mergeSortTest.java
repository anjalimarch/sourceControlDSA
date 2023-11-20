package PackageName;

public class mergeSortTest {

    public static void main(String args [] ){
        int [] data = {45,53,12,54,89,21,32,31,13};
        devide(data, 0, data.length-1);

    }

    public static void conquer(int [] arr, int low, int high, int mid){
        int [] finalArr=new int [arr.length];

        int i = low;
        int j= mid+1;
        int k= low;
        while(i<mid && j<high){
        if(arr[i]<arr[j])
        {

           finalArr[k]=arr[i];
           i++;k++;

        }

            else
                {

                    finalArr[k]=arr[j];
                    k++;
                    j++;

                }


            while (i<=mid){

            finalArr[k]=arr[i];
            i++;
            k++;
            }
            while (j<high){

                finalArr[k]=arr[j];
                j++;
                k++;
            }
        }


    }

    public  static void devide(int arr[] , int si, int ei){

        if(si>=ei){
            for (int val:arr
                 ) {
                System.out.println(val);

            }

            return;



        }

        int mid = (si+ei)/2;
        devide(arr, si, mid);
        devide(arr, mid+1, ei);
        conquer(arr,si, ei,mid);
    }
}
