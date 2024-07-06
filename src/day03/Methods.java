package day03;

public class Methods {

    int noofseats = 6;
    double mileage = 30.7;
    String color = "Red";
    String feultype = "Petrol";

    // return / no-return / param/ no-param

    // No-return and No-parameter
    public void getMilege() {
        System.out.println(mileage);
    }

    // Return but No-parameter
    public String getFeultype() {
        return feultype;
    }

    // No-return but Parameter
    public void changeGear(int gear) {
        System.out.println("Changing gear: " + gear);
    }

    // Return and Parameter
    public int addition(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        Methods m = new Methods();

        m.getMilege();
        System.out.println(m.getFeultype());
        m.changeGear(3);
        int sum = m.addition(10, 20);
        System.out.println(sum);
        System.out.println(sum);
    }
}
