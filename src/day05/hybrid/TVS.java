package day05.hybrid;

public class TVS extends Bike {

    public int mileage = 30;
    public String name = "Apache";

    public static void main(String[] args) {
        TVS bike = new TVS();
        System.out.println(bike.name);
        System.out.println(bike.mileage);
        System.out.println(bike.no_of_wheels);
        System.out.println(bike.feultype);
    }
}