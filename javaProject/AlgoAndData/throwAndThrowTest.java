package AlgoAndData;



class negativeRadiusException extends  Exception{

    @Override
    public String toString() {
        return "negative data is not allowed";
    }

    public  String getMessage(){

        return  "excetption has occured for the negative input";
    }
}

public class throwAndThrowTest {

    public  static  double area(int r) throws negativeRadiusException {

        if(r<0){

            throw new negativeRadiusException();



        }
        double result = Math.PI*r*r;
        return  result;

    }
public  static int divide(int a, int b) throws  ArithmeticException{

    int result =a/b;
    return  result;


}
    public static void main(String args [])  {

    try {
      //  int c = divide(6,0);
      //  System.out.println(c);
    }catch (Exception e){


        System.out.println(e.getMessage());
        e.printStackTrace();
    }

try{
    double ar = area(-9);

}catch (Exception e ){

    System.out.println("negative radius for the area :"+e);
    System.out.println(e.getMessage());
    e.printStackTrace();
}


    }
}
