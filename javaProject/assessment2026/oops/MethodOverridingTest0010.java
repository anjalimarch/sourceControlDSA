package assessment2026.oops;

class A{


    public int haryy(){

        return 4;
    }



public void meth2(){
   System.out.println("I am method 2 of class A");

}

}

class B extends A{

    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");

    }


    public void meth3(){

        System.out.println("I am method 3 of class B");


    }


}


public class MethodOverridingTest0010 {


    public static void main(String[] args) {


        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
