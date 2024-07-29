package day05.multilevel;

public class Child extends Father {
    public int age = 25;
    public String mobile = "iphone 16";

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.age);
        System.out.println(child.mobile);
        System.out.println(child.prop);
        System.out.println(child.vehicle);

        Father father = new Father();
        System.out.println(father.age);
//        System.out.println(father.mobile);
        System.out.println(father.prop);
        System.out.println(father.vehicle);

        GrandFather grandFather = new GrandFather();
        System.out.println(grandFather.age);
//        System.out.println(grandFather.mobile);
        System.out.println(grandFather.prop);
        System.out.println(grandFather.vehicle);
    }
}
