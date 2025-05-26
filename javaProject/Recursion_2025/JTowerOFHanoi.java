package Recursion_2025;

public class JTowerOFHanoi {

    public static  void main (String args [] ){
        int n = 3;

        towerHanoi(3, 'A','B','C' );
    }

    public static void  towerHanoi(int n, char  src,char aux,char dest ){

                                          //src, // aux // dest
                  if (n==1 ){

                      System.out.println(src +"->"+ dest );
                     return;
                  }

        towerHanoi( n-1,   src , dest, aux  );
        towerHanoi( 1,   src, aux, dest );
        towerHanoi( n-1,   aux, src, dest );




    }
}
