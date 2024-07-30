package day06.overloading;

public class ArithOp {

    public int sum(int a, int b) {
        System.out.println("int int");
        return a + b;
    }

    public double sum(int a, double b) {
        System.out.println("int double");
        return a + b;
    }

    public double sum(double a, double b) {
        System.out.println("double double");
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        ArithOp op = new ArithOp();
        ArithOp op1 = new ArithOp();

        System.out.println(op.sum(1, 2));
        System.out.println(op.sum(10, 11.5));
        System.out.println(op.sum(10.5 , 10.5));
        System.out.println(op.sum(11, 22, 33));

    }
}
