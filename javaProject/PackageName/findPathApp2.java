package PackageName;

public class findPathApp2 {

    public static void main(String args [])
    {

        int n;
        int m;

       int p= path(3,3);
       System.out.println(p);



    }
public  static int path(int n,int m){
          int p1, p2;
        if(n==1||m==1){

            return 1;



        }

                 p1=path(n-1,m);
                 p2=path(n,m-1);

                 return p1+p2;



}

}
