package day06.overriding;

public class Father extends GrandFather {
    private int age = 47;
    private String prop = "FSpecs";

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getProp() {
        return prop;
    }
}
