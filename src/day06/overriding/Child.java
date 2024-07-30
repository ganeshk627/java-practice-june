package day06.overriding;

public class Child extends Father {
    private int age = 25;
    private String mobile = "iphone 16";

    @Override
    public int getAge() {
        return age;
    }



    public static void main(String[] args) {
        Child child = new Child();
//        System.out.println(child.age);
//        System.out.println(child.mobile);
//        System.out.println(child.prop);
//        System.out.println(child.vehicle);

        Father father = new Father();
//        System.out.println(father.age);
////        System.out.println(father.mobile);
//        System.out.println(father.prop);
//        System.out.println(father.vehicle);

        GrandFather grandFather = new GrandFather();
//        System.out.println(grandFather.age);
////        System.out.println(grandFather.mobile);
//        System.out.println(grandFather.prop);
//        System.out.println(grandFather.vehicle);
    }
}
