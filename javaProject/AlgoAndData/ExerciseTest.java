package AlgoAndData;


class customExpe extends  ArithmeticException{


    @Override
    public String toString() {
        return "HAAHAHAHA";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

public class ExerciseTest {

    public static  void main(String args [])

    {

        /*int a =7;
        int age =78;
        int year_born =2000-78;
        System.out.println(age/0);



*/

        int a=0;
        int b= 8;
        try{
       if(a==0){

           throw new customExpe();
       }

        }catch(Exception e){

            e.printStackTrace();
            e.toString();
            e.getMessage();


        }




    }

}
