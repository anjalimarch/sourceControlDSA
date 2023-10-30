package PackageName;

public class josephTest {
    public  static void main (String args []){
       int p= j(7,3);
       System.out.println(p);
    }

    public  static int j(int n,int k){
            if(n==1){
              return 0;

            }



       return (j(n-1,k)+k)%n;




    }
}
