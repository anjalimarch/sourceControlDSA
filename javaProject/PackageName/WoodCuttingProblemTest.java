package PackageName;

public class WoodCuttingProblemTest {

    public  static void main (String args [] ){

        int [] h= {20, 15, 10, 17 };
        int b=8 ;
         int wc = 0;

        maxWoodCut(h, b , wc);
    }
public static int maxWoodCut(int [] h,int  b,int  wc ){

  int maxH = h[0];
  int low = 0;
  int mid=0;
  while (low <=maxH){
      mid  = (maxH+low)/2;
      wc =  woodCount(h, 0, mid);

     if(wc==b || low ==mid){
         System.out.println("Desiered wood count "+b);
         return mid;
     }
     else if(wc>b){

          low= mid;
      }else {

         maxH = mid ;
     }




}
return -1;
    }

    public static int woodCount (int [] h,int  wc, int mid  ){

        for(int i =0; i<h.length; i++) {
           if(h[i]>mid){
            wc = wc +(h[i] - mid);
        }}
      return wc;
    }

}
