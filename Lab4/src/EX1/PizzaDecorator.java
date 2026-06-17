package EX1;

public class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String descricao() {
        return pizza.descricao();
    }
    public double custo() {
        return pizza.custo();
    }
}

