package assessment2026.oops;


class Base{

    int x;
    Base(){

        System.out.println();
    }
    public int getX() {
        System.out.println("I am getting x now");
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }

    public void printMe(){

        System.out.println("I am a constructor");
    }



}

class Derived extends Base{

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class TestInheritance007 {





    public static void main(String[] args) {
        Base b = new Base();
        b.setX(44);



        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(45);
        System.out.println(d.getX());
        Base bb= new Derived();
        bb.setX(78);
        System.out.println(bb.getX());
        System.out.println(b);
        System.out.println(bb);
        System.out.println(d);


    }


}
