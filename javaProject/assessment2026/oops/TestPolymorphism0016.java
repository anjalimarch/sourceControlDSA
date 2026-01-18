package assessment2026.oops;

interface CameraPoly {
    void takeSnap();
    void recordVideo();

    private void greet(){

        System.out.println("private method");
        //cant be used in class but can be accessed via another method.
    }
    default void record4KVideo(){
        greet();

        System.out.println("Recording in 4K:");
    };


}

interface WifiPoly{

    String[] getNetworks();
    void connectToNetwork(String network);

}

class MyCellPhonePoly{
    void callNumber(int phoneNumber){

        System.out.println("Calling"+phoneNumber);


    }

  /*  void takeSnap(){

        System.out.println("Taking Snap");

    }*/

    void pickCall(){

        System.out.println("Connecting ...");
    }
}

class MySmartPhonePoly extends MyCellPhonePoly implements WifiPoly, CameraPoly{


    @Override
    public void takeSnap() {
        System.out.println("take snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("record video");

    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");

        String [] networkList ={"Harry","Prashanth", "Anjali5G"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting to network:"+network);
    }

   /* public void record4KVideo(){

        System.out.println("recording 4k video: in smarthphone class ");
    }*/




}


public class TestPolymorphism0016 {

    public static void main(String[] args) {

        CameraPoly ms = new MySmartPhonePoly(); //all the methods of interface only

      //  ms.getNetworks()// its wrong
        ms.record4KVideo();
        MySmartPhonePoly ms2= new  MySmartPhonePoly();
        ms2.connectToNetwork("ACT");
        ms2.getNetworks();
        ms2.recordVideo();
        ms2.takeSnap();
        ms2.callNumber(78);
        ms2.pickCall();
        MyCellPhonePoly mc= new  MySmartPhonePoly(); //only reference methods
           mc.callNumber(89);
           mc.pickCall();



    }

}
