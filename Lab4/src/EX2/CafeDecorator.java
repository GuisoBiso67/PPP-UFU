package EX2;

public class CafeDecorator implements Cafe {
    protected Cafe cafe;
    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public double calculaCusto() {
        return cafe.calculaCusto();
    }
    public String getDescricao() {
        return cafe.getDescricao();
    }
}
