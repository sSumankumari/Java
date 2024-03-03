interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello! Welcome to my camera");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording video in 4k...");
    }
}
interface MyWiFi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWiFi2{
    @Override
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording the video");
    }
    //    public void record4KVideo(){
//        System.out.println("Recording the video in 4k in SmartPhone");
//    }
    public String[] getNetworks(){
        System.out.println("Getting the List of Networks");
        String[] networkList = {"Harry", "Prashant", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }

    public void sampleMeth(){
        System.out.println("This is the sample method of class 'SmartPhone'.");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2(); // This is a smartphone but use it only as a camera
//        cam.getNetworks(); // not allowed
//        cam.sampleMeth(); // not allowed
        cam.record4KVideo();

        MySmartPhone2 sm = new MySmartPhone2();
        sm.sampleMeth();
        sm.recordVideo();
        sm.getNetworks();
        sm.callNumber(562565757);
        sm.pickCall();
    }
}
