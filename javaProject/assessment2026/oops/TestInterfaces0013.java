package assessment2026.oops;

//multiple interfaces can be utilised to produce one class which is called multiple inheritance.
//however, cant be achieved same with classes
//interface methods will be public


interface Bicycle{

    int a =45; //create properties in interface, but cant modify these as it is final

    void applyBrake(int decrement);
    void speedUp(int increment);


}

interface HornBicycle{
   // int a =45; //this is incorrect create properties in interface, but cant modify these as it is final

    void blowHornK3g();
    void blogHornmhn();

}

class AronCycle implements Bicycle, HornBicycle{

    int speed =7;
 // can be overriden
    int a =88;
    void blowHorn(){

        System.out.println("Blow horn");
    }

    @Override
    public void applyBrake(int decrement) {

      speed=speed-decrement;
      System.out.println("decrease speed:"+speed);

    }

    @Override
    public void speedUp(int increment) {

       speed=speed+increment;
        System.out.println("increase: speed up :"+speed);
    }

    public void blowHornK3g(){
       System.out.println("Kabhi khushi kabhi gum");

    }
   public void blogHornmhn(){

    System.out.println("Main hun na");
    }
}



public class TestInterfaces0013 {

    public static void main(String[] args) {

        AronCycle cycleone= new AronCycle();
        cycleone.applyBrake(5);
        System.out.println(cycleone.a);
        cycleone.blogHornmhn();
        cycleone.blowHornK3g();


    }
}
