package EX1;

public class Pizzaria {
    public static void main(String[] args) {
        Pizza portuguesa = new MolhoTomate(new Queijo(new Tomate(new Ovo(new MassaFinaPizza()))));
        System.out.println("PORTUGUESA");
        System.out.println("R$" + portuguesa.custo());
        System.out.println(portuguesa.descricao());

        Pizza marguerita = new MolhoTomate(new Queijo(new Tomate(new MassaEspessaPizza())));
        System.out.println("MARGUERITA");
        System.out.println("R$" + marguerita.custo());
        System.out.println(marguerita.descricao());
    }
}
