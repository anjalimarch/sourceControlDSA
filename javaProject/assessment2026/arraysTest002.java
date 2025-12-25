package assessment2026;

public class arraysTest002 {

    public static  void main(String args []){
        int [] a = new int[6];
        int [] b= {3,4,7,3,5,6};
        traverseArray (a);
        printArray(a);
        printArray(b);

    }


    public static  void traverseArray(int [] a ){

        for (int i=0; i<a.length; i++){


            a[i]=90+i;



        }


    }


    public static void printArray(int [] a){

        for(int j=0; j<a.length;j++){

            System.out.println(a[j]);

        }

    }
}

