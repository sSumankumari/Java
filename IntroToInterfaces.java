interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    int speed = 40;
    void blowHorn(){
        System.out.println("Blowing Horn: Pee Pee Poo Poo");
    }
    @Override
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp");
        speed = speed + increment;
    }

    public void blowHornK3g(){
        System.out.println("Kabhi Khushi Kabhi Gum pee pee pee pee");
    }
    public void blowHornmhn() {
        System.out.println("Main Hoon Naa po po po po");
    }
}

public class IntroToInterfaces {
    public static void main(String[] args) {
        AvonCycle avncy = new AvonCycle();
        System.out.println("Speed of the Cycle: "+ avncy.speed);

        avncy.applyBrake(5);
        System.out.println("Speed of the Cycle: "+ avncy.speed);

        System.out.println(avncy.a);
//        avncy.a = 50; // Will throw an error

        avncy.speedUp(10);
        System.out.println("Speed of the Cycle: "+ avncy.speed);

        avncy.blowHornK3g();
        avncy.blowHornmhn();
        avncy.blowHorn();
    }
}
