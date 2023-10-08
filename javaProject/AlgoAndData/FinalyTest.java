package AlgoAndData;

public class FinalyTest {



    public static  void main(String args[]) {

        int a = 0;
        int b = 2;
        int d=  cleaningUpFunction();
        System.out.println("Value of clean up function:"+ d);

   /*     try {

        int c = b / a;
        }catch (Exception e){


            System.out.println(e);
            e.printStackTrace();
        }finally {
             System.out.println("This is end of program: as executed with finally ");
        }


*/
    }

    public static int cleaningUpFunction(){

        int a, b;
        a=0;
        b=8;
        try
        {
            int d = b/a;
            return d;

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("cleaning up of the resources" +
                    "finally");
        }


        return 0;
    }
}
