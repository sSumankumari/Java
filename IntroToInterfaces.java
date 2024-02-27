interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp");
    }
}

public class IntroToInterfaces {
    public static void main(String[] args) {

    }
}
