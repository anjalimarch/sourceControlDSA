package assessment2026.oops;

abstract class Parent2{

    public  Parent2(){


        System.out.println("Mai base2 ka constructor hun");
    }

    public void sayHello(){

        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();

}

class Child2 extends Parent2{

  @Override
  public void greet(){
      System.out.println("Good Morning");

  }

  @Override
  public void greet2(){

      System.out.println("Good afternoon");

  }

}

abstract class Child3 extends Parent2{

    public void th(){


        System.out.println("I am good");
    }



}








public class TestAbstractClass0012 {

    public static void main(String[] args) {




    }


}
