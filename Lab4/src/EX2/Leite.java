package EX2;

public class Leite extends CafeDecorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    public double calculaCusto() {
        return cafe.calculaCusto() + 2;
    }
    public String getDescricao() {
        return cafe.getDescricao() + "Leite;";
    }
}
