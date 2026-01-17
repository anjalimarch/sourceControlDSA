package assessment2026.oops;



interface Bicycle{

    void applyBrake(int decrement);
    void speedUp(int increment);


}

class AronCycle implements Bicycle{

    int speed =7;

    @Override
    public void applyBrake(int decrement) {

      speed=speed-decrement;

    }

    @Override
    public void speedUp(int increment) {

       speed=speed+increment;
    }
}



public class TestInterfaces0013 {

    public static void main(String[] args) {

    }
}
