package day05.hybrid;

public class Yamaha extends Bike {

    public int mileage = 45;
    public String name = "R15";

    public static void main(String[] args) {
        Yamaha bike = new Yamaha();
        System.out.println(bike.name);
        System.out.println(bike.mileage);
        System.out.println(bike.no_of_wheels);
        System.out.println(bike.feultype);
    }
}
