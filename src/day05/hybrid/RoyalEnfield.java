package day05.hybrid;

public class RoyalEnfield extends Bike {
    public int mileage = 23;
    public String name = "Himalayan";
    public String feultype = "Diesel";

    public static void main(String[] args) {
        RoyalEnfield bike = new RoyalEnfield();
        System.out.println(bike.name);
        System.out.println(bike.mileage);
        System.out.println(bike.no_of_wheels);
        System.out.println(bike.feultype);
    }
}
