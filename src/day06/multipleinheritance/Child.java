package day06.multipleinheritance;

public class Child implements Mom, Dad {

    @Override
    public void fulfilMyDream() {
        System.out.println("I wanted to become an Engineer!");
    }

    @Override
    public void eatWell() {
        System.out.println("Eating healthy food!");
    }

    @Override
    public void studyWell() {
        System.out.println("Studying hard with concentration!");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.fulfilMyDream();
        child.eatWell();
        child.studyWell();
    }


}
