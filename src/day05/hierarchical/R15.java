package day05.hierarchical;

public class R15 extends Yamaha {
    String name = "R15";
    public static void main(String[] args) {
        R15 bike = new R15();
        System.out.println(bike.name);
        System.out.println(bike.mileage);
        System.out.println(bike.no_of_wheels);
        System.out.println(bike.feultype);
    }
}
