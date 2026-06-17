package EX2;

public class Canela extends CafeDecorator{
    public Canela(Cafe cafe) {
        super(cafe);
    }

    public double calculaCusto() {
        return cafe.calculaCusto() + 4;
    }
    public String getDescricao() {
        return cafe.getDescricao() + "Canela;";
    }
}
