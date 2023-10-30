package PackageName;

public class checkArraySortedTest {

    //sorted and strictly increasing


    public static void main(String args []){
        int [] a= {1,2,6,4,5};
        int i=0;

        sortedAndIncreasing(a,0);

    }


    public static void sortedAndIncreasing(int [] a,int idx ){

        if(idx==a.length-1){
            System.out.println("reached end of the array");
            return;


        }

           if(a[idx]<=a[idx+1]){

               System.out.println("sorted");

           }else{
               System.out.println("not sorted");
                return;
           }




        sortedAndIncreasing(a,idx+1);




    }
}
