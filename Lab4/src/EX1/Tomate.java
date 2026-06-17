package EX1;

public class Tomate extends PizzaDecorator{
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    public double custo() {
        return pizza.custo() + 2;
    }
    public String descricao() {
        return pizza.descricao() + "Tomate";
    }
}
