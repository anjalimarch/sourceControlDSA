package assessment2026.oops;

abstract class Parent2{

    public  Parent2(){


        System.out.println("Mai base2 ka constructor hun");
    }

    public void sayHello(){

        System.out.println("Hello");
    }
    public void onlyInParent(){

        System.out.println("only in parent");
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


    public void onlyInChild(){

        System.out.println("only in child ");

    }

}

abstract class Child3 extends Parent2{

    public void th(){


        System.out.println("I am good");
    }



}








public class TestAbstractClass0012 {

    public static void main(String[] args) {
        Parent2 a = new Child2();
       a.greet();
       a.greet2();
       a.sayHello();
       a.onlyInParent();
       //a.onlyInChild // ref hi class k method decide karega ya to unique ya fir overriden  wrong
        Child2 c = new Child2();
        c.greet();
        c.greet2();
        c.sayHello();
        c.onlyInParent();
        c.onlyInChild();


    }


}
