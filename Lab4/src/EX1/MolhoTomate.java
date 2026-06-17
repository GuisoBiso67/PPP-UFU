package EX1;

public class MolhoTomate extends PizzaDecorator{
    public MolhoTomate(Pizza pizza) {
        super(pizza);
    }

    public double custo() {
        return pizza.custo() + 1;
    }
    public String descricao() {
        return pizza.descricao() + "Molho de tomate;";
    }
}
