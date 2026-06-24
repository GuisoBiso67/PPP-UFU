package Ex1;

public class Main {
    public static void main(String[] args){
        Cafe cafe = new Cafe();
        cafe.preparoCompleto("Ex1.Cafe");
        System.out.println("-------------------");
        Cappucino cappucino = new Cappucino();
        cappucino.preparoCompleto("Ex1.Cappucino");
        System.out.println("-------------------");
        Cha cha = new Cha();
        cha.preparoCompleto("Ex1.Cha");

    }
}
