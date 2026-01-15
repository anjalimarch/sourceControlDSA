package assessment2026.oops;



class EkClass {

    int a;

    public int getA() {
        return a;
    }

    EkClass(int v) {
        this.a = v;

    }

    public int returnOne() {

        return 1;

    }
}

    class DoClass extends EkClass{

       DoClass(int c ){
           super(c);
           System.out.println("mai doclass constructor--"+ c);

       }

    }





public class TestThisImplementation009 {

    public static void main(String[] args) {
      /*  EkClass e = new EkClass(5);
        System.out.println(e.getA());

        System.out.println(e);*/

        DoClass d = new DoClass(67);

       // e.getA();


    }
}
