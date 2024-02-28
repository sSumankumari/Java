interface MyCamera{
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
interface MyWiFi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera, MyWiFi{
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
}

public class DefaultMethods {
    public static void main(String[] args) {
        MyCellPhone cph = new MyCellPhone();
        cph.callNumber(987326786);
        cph.pickCall();
        System.out.print("\n");

        MySmartPhone sph = new MySmartPhone();
        sph.record4KVideo();
        sph.takeSnap();
//        sph.greet(); // Will throw an error

        String[] arr = sph.getNetworks();
        for (String item : arr){
            System.out.println(item);
        }
        sph.connectToNetwork("CodeWithHarry");
    }
}
