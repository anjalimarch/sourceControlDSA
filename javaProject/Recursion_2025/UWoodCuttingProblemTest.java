package Recursion_2025;

public class UWoodCuttingProblemTest {

   public static void main(String args[]) {

      int[] h = {20, 15, 10, 17};
      int b = 7;
      System.out.println(machineHeight(h, b));


   }


   public  static  int findWoodCount(int [] ht , int m )
   {
      int wc = 0;
      for (int j=0; j< ht.length; j++)
      {
         if (ht[j]>m )
            wc =wc + (ht[j]-m) ;

      }
    return  wc;
   }

   public static int machineHeight(int[] h, int b) {
      int max = 0;
      for (int i = 0; i < h.length; i++) {
         if (h[i] > max) {
            max = h[i];

         }
      }
     int l=0 ; int high = max; int mid =0;

     while (l<=high){
        mid= (l+high)/2;
        int wc = findWoodCount(h, mid);

        if (wc ==b || l==mid ){

           return  mid;

        } else if (wc>b) {

           l=mid;

        }else {

           high = mid;
        }
     }

      return  mid;
   }
}
