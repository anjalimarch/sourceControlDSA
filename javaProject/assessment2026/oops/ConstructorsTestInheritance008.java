package assessment2026.oops;


import javax.rmi.ssl.SslRMIClientSocketFactory;

class Base1 {

    Base1(){


        System.out.println("mai consturctor");
    }

    Base1(int a){

        System.out.println("I am a constuctor with value of a as :"+a);


    }

     public int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}

class Derived1 extends Base1{

    Derived1(){

        super(100);

        System.out.println("mai derived class consturctor hun");
    }

    Derived1(int c, int d){
        super(111);

        System.out.println("I am a constuctor with value of c as :"+c);
        System.out.println("I am a constuctor with value of d as :"+d);

    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}





public class ConstructorsTestInheritance008 {


    public static void main(String[] args) {

       // Base1 b1= new Base1();
     //   Base1 b2= new Base1(9);
      //  b1.setX(11);

      //  System.out.println(b1.getX());
        //b1.getX();
        //Derived1 d = new Derived1();
        Derived1 e = new Derived1(89,91);
      //  System.out.println(d.getX());
       // d.getX();

    }
}
