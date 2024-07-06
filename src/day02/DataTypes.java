package day02;


public class DataTypes
{




    public static void main(String[] args)
    {
        // ATTRIBUTES/ VARIABLES
        // i am comment
        //numbers - int, float, long
        //int - 32 bit
        int noofseats = 6;
        int temp = -5;
        // float - 32 bit
        float laptime_s = 1.0039434343434F;
        // double - 64 bit
        double mileage = 30.799343434343434343435;
        // long - 64 bit
        long chasisno = 987654321;
        // string - "sequence of chars" - 32 bit
        String title = "I am number 1";
        String phone_number = "9876543210";
        String color = "Red";
        String feultype = "Petrol";
        // boolean - true/ false - 1 bit
        boolean autopilot = true;
        boolean four_wheel_control = false;
        // array (String)
        String [] addfeatures =  new String[] {"Automatic mirror adjustmnet", "Parking camera", "Top open"} ;// collection of single datatype


        System.out.println(noofseats);
        System.out.println(mileage);
        // System.out.println(color);
        System.out.println(feultype);
        System.out.println(addfeatures.length);




    }
}
