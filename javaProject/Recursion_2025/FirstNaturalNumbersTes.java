package Recursion_2025;

public class FirstNaturalNumbersTes {
    public static void main (String args[]){

        funcnatural(5);






    }

    static void funcnatural(int n ){



        if(n==0)
        {
            return;


        }
        funcnatural(n-1);
        System.out. println(n);
    }
}
