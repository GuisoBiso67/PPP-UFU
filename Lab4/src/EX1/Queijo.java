package EX1;

public class Queijo extends PizzaDecorator{
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    public double custo() {
        return pizza.custo() + 1;
    }
    public String descricao() {
        return pizza.descricao() + "Queijo;";
    }
}
