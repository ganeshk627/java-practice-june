package day04.inner;

import day03.Methods;

public class Shapes {

    public void Circle() {
       // access from anywhere
    }

    private void Rectangle() {
        // within the class only
    }

    protected void Triangle() {
        // within the package/ folder
    }

    // final - value cannot be changed once assigned
    public final double PI = 3.14;
    // static - only one instance for a class
    public static double RADIUS = 5;


    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        // public
        shapes.Circle();
        Methods methods = new Methods();
        methods.getMilege();

        // private
        shapes.Rectangle();

        // protected
        shapes.Triangle();


        System.out.println(shapes.PI);
        System.out.println(shapes.RADIUS);
//        shapes.PI = 3.44;
        shapes.RADIUS = 7;
        System.out.println(shapes.RADIUS);
        shapes.RADIUS = 10;
        System.out.println(shapes.RADIUS);
    }
}
