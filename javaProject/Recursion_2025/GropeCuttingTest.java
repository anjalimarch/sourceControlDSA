package Recursion_2025;

public class GropeCuttingTest {

    public  static  void main (String  args []){



      int result=   pieces(15,5,8,7);
      System.out.println(result);
    }
 public static int pieces(int len, int a, int b , int c ){
            if(len==0){
                return 0;

            }
            else  if(len<0){
                return  -1;


            }

        int p1= pieces(len-a,a, b,c);
        int p2= pieces(len-b,a,b,c);
        int p3 = pieces(len-c, a, b,c);

         int maxPieces=  findMax (p1,p2,p3);
            if(maxPieces==-1) {
                return -1;
            }
            return  maxPieces+1;
     }

   public static int findMax(int p1,int p2, int p3){
        int max= p1;
        if(p2>p3){
            if(max>p2) {
                max = p1;
                return  max;
            }else{

            max = p2;
                return  max;
            }
        }else {

            if(max >p3 ){

                max = p1;
                return  max;
            }else{

                max = p3;
                return  max;

            }
        }


    }
}
