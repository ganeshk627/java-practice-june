package day07.exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;


        try {
            // exception code
            System.out.println(b / a);
            System.out.println(a / b); //java.lang.ArithmeticException: / by zero
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bound error handled!");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic error handled!");
//            System.out.println(e);
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Any error handled!");
            System.out.println(e);
        }


        int array[] = {12, 23, 11};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        try {
            System.out.println(array[3]); //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        } catch (ArrayIndexOutOfBoundsException arith) {
            System.out.println("array out of bound error handled!");
            //            System.out.println(e);
        } catch (ArithmeticException arith) {
            System.out.println("arithmetic error handled!");
            //            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception handled!");
            //            System.out.println(e);
        }

        System.out.println("Program completed!!!");
    }
}
