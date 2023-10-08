package AlgoAndData;

 class MyException extends Exception {

     public String toString() {
         return super.toString() + "I am toString()";
     }

     public String getMessage() {

         return super.getMessage() + "I am getMessage";
     }




     }

class AgeException extends Exception {

    public String toString() {
        return  "Make sure age is not 0 and -ve and more than 100";
    }

    public String getMessage() {

        return "Display message that: Make sure age is not 0 and -ve and more than 100";
    }




}

     public class CustomExceptionTest {

         public static void main(String args[])  {
             checkAgemethod(100);
             int a = 9;

             if (a < 99) {
                try{

                   throw new MyException();

                   // throw new ArithmeticException("This is exception");
                }catch (Exception e){

                 //   System.out.println("Anjali is throwing Exception:"+e.getMessage()+"--"+e.toString());
                    e.printStackTrace();
                    System.out.println("Finished");



                }

                System.out.println("Finished out side catch block: ");



             }








             }



         public static void checkAgemethod(int age){
             if(age<0||age >99){
                 try {
                     throw new AgeException();
                 }catch (Exception e){
                     System.out.println(e.toString()+"---"+e.getMessage());
                     e.printStackTrace();



                 }
             }
         }


     }


