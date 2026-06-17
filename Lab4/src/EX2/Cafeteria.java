package EX2;

import EX1.*;

public class Cafeteria {
    public static void main(String[] args) {
        Cafe cappucino = new Leite(new Chocolate(new Expresso()));
        System.out.println("Cappucino = R$" + cappucino.calculaCusto());
        System.out.println("Cappucino = " + cappucino.getDescricao());
    }
}
