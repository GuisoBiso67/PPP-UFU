package interfacesegregation.correct;

public class Crow implements FlyBird {

    @Override
    public void eat() {
        System.out.println("Crow eat");
    }

    @Override
    public void sleep() {
        System.out.println("Crow sleep");
    }

    @Override
    public void fly() {
        System.out.println("Crow fly");
    }
    
}
