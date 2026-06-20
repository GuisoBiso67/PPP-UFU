package EX4;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("MXRF11");

        Investidor i1 = new Investidor(30, 50, acao);
        Investidor i2 = new Investidor(35, 60, acao);

        acao.addInvestidor(i1);
        acao.addInvestidor(i2);

        acao.setPreco(25);
        acao.setPreco(55);
    }
}
