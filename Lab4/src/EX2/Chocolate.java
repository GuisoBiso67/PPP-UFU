package EX2;

public class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    public double calculaCusto() {
        return cafe.calculaCusto() + 3;
    }
    public String getDescricao() {
        return cafe.getDescricao() + "Chocolate;";
    }
}
