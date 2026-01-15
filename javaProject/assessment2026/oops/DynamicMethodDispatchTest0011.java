package assessment2026.oops;

class Phone{

    public void greet(){

        System.out.println("Good Morning");
    }

    public void name(){

        System.out.println("My name is Java");
    }

}


class SmartPhone extends Phone {

    public void swagat(){

        System.out.println("Aapka Swagat hai");
    }


    public void name (){


        System.out.println("My name is java in class Two");
    }
}




public class DynamicMethodDispatchTest0011 {

    public static void main(String[] args) {

       /* Phone obj =new Phone();
        SmartPhone smobj = new SmartPhone();

        obj.name();*/

    Phone obj = new SmartPhone();

    obj.greet();
    obj.name();// sub class method will be called
        
   // SmartPhone obj2= new Phone(); //wrong


    }
}
