package assessment2026.oops;




interface Camera {
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){

        System.out.println("Recording in 4K:");
    };


}

interface Wifi{

    String[] getNetworks();
    void connectToNetwork(String network);

}

class MyCellPhone{
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

class MySmartPhone extends MyCellPhone implements Wifi, Camera{


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

    public void record4KVideo(){

        System.out.println("recording 4k video: in smarthphone class ");
    }
}


public class TestInterface0014 {

    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
      String[] nteworks=   ms.getNetworks();

      for(String n: nteworks){

          System.out.println(n);

      }

       ms.record4KVideo();

    }

}
