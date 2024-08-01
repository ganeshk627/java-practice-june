package day07.constructor;

public class Bus {

    //constructor
    // Same as class name
    // always public
    // no return type
    // can pass parameter
    public Bus() {
        System.out.println("Starting the Bus...");
    }


    public void applyBrake() {
        System.out.println("Applying Brake...");
    }

    public void blowHorn() {
        System.out.println("Blowing Horn...");
    }

    public void changeGear(int gear) {
        System.out.println("Chagning gear:\t"+gear);
    }

    public static void main(String[] args) {
        Bus b = new Bus();
        Bus bus = new Bus();

    }


}
