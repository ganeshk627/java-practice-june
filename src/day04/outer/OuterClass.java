package day04.outer;

import day04.inner.Shapes;

public class OuterClass {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        //public
        shapes.Circle();

        // private
//        shapes.Rectangle();

        // protected
//        shapes.Triangle();
    }
}
