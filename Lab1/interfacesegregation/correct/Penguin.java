package interfacesegregation.correct;

public class Penguin implements NoFlyBird {

    @Override
    public void eat() {
        System.out.println("Penguin eat");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin sleep");
    }
}
