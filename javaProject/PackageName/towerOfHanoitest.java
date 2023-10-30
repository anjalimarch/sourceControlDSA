package PackageName;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class towerOfHanoitest {

    public static void main(String args []){
        int n = 3;
       towerOFhanoi( n, 'A',  'B',  'C');


    }


    public  static void towerOFhanoi(int n, char src, char aux, char dest){

        if(n==1){

            System.out.println(src +"->"+dest);
             return;


        }

                towerOFhanoi(n-1, src, dest, aux);
                towerOFhanoi(1, src, aux, dest);

                towerOFhanoi(n-1, aux, src, dest);

    }
}
