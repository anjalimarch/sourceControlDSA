package PackageName;

public class pathAndTile {
    public static void main(String args []){
        int n, m;
        n=4;
        m=2;
      int val=   tile(n,m);
      System.out.println(val);


    }

    public static int tile(int n, int m){

        if (n==m){

            return 2;
        }
        if (n<m){

            return 1;
        }

       int p1=  tile(n-1,m);
       int  p2= tile(n-m,m);
       return p1+p2;

    }
}
