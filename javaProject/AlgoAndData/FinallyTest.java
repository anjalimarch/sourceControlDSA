package AlgoAndData;

public class FinallyTest {

    public  static  void  main(String args []){

        while (true){

            int a, b,c;
            a=0;
            b=16;
            try
            {

                c= b/a;
                System.out.println(c);
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                break;


            }

            finally {
                System.out.println("Finally block");
            }



        }


    }
}
