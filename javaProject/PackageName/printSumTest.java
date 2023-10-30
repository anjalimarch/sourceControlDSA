package PackageName;

public class printSumTest {

    public  static void main(String args []){
       pringSum(5,1,0);


    }

    public  static  void pringSum(int n, int  i, int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);

            return;

        }

        sum = sum+i;
        pringSum(n, i+1, sum);
        System.out.println(i);

    }
}
