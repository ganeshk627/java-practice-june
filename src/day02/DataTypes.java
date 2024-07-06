package day01;

// 0. Class name and file name should be same
// 1. Class should start with uppercase
// 2. Should not start with number but can end with number
// 3. only "_" is allowed
// 4. Contains number or upper or lower case or underscore
public class Car
{

    //// ATTRIBUTES/ VARIABLES
    // i am comment
    //numbers - int, float, long
    int noofseats = 6;
    double mileage = 30.7;
    // string - "sequence of chars"
    String color = "Red";
    String feultype = "Petrol";
    boolean autopilot = true;
    boolean four_wheel_control = false;
    // array (String)
    String [] addfeatures=  new String[] {"Automatic mirror adjustmnet", "Parking camera", "Top open"} ;// collection of single datatype


    //// BEHAVIOURS/ METHODS
    public void pressAccelerator() {
        System.out.println("Pressing Accelerator...!");
    }
    public void pressBrake() {
        System.out.println("Pressing Brake...!");
    }

    public void getFeulType() {
        System.out.println(feultype);
    }


    public static void main(String[] args)
    {
        // creating object of class 'Car'
        Car car = new Car();


//        System.out.println("hello");
//        System.out.println(12);
        System.out.println(car.noofseats);
        System.out.println(car.mileage);
        // System.out.println(color);
        System.out.println(car.feultype);
        System.out.println(car.addfeatures.length);


        car.pressAccelerator();
        car.pressAccelerator();
        car.pressBrake();
        car.getFeulType();
        car.getFeulType();

    }
}
