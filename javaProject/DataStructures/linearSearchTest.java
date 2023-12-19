package DataStructures;

public class linearSearchTest {


    public static void main (String args []){

        int [] a= {10,50,30,70,80,60,20,90,40};// not sorted
        int x= 90;
         linearSearch(a,x);
    }
    public static void linearSearch(int [] a, int x){

        for(int i=0;i<a.length;i++){

            if(x==a[i]){

                System.out.println("found "+i);


            }


        }


    }


}
