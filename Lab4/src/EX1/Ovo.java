package EX1;

public class Ovo extends PizzaDecorator{
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    public double custo() {
        return pizza.custo() + 3;
    }
    public String descricao() {
        return pizza.descricao() + "Ovo;";
    }
}
