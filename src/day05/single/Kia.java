package day05.single;

public class Kia extends Car {
    public int feul_capacity = 20;
    public static void main(String[] args) {
//        Car car = new Car();
//        car.

        Kia kia = new Kia();
        System.out.println(kia.feul_capacity);
        System.out.println(kia.no_of_wheels);
        kia.startEngine();
    }
}
