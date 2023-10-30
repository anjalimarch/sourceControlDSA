package PackageName;

public class FindPathTest {
//number of ways in n*m matrics




    public static void main(String args []){
      int n, m;
      n=3; m=3;
        int path = count(n,m,0,0);

        System.out.println(path);

    }


    public  static int count(int n, int m,int i, int j){
        if(i==n || j==m ){

            return 0;
        }


        if(i==n-1 && j==m-1 ){

            return 1;
        }
     int r=   count(n,  m, i+1, j);
     int l=   count( n, m, i,  j+1);

     return l+r;
    }
}
