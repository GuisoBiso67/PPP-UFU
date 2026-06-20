package EX4;

public class Investidor implements Observer {
    private AcaoBroker broker;
    private double limiteMin;
    private double limiteMax;
    private Acao acao;

    public Investidor(double min, double max, Acao acao) {
        this.limiteMin = min;
        this.limiteMax = max;
        this.acao = acao;
        this.broker = new AcaoBroker(this);
    }

    @Override
    public void update(double preco) {
        System.out.println("Preço recebido: " + preco);

        if (preco <= limiteMin) {
            broker.comprar(acao);
        } else if (preco >= limiteMax) {
            broker.vender(acao);
        }
    }
}
