package EX4;

public class AcaoBroker {
    private Investidor investidor;

    public AcaoBroker(Investidor investidor) {
        this.investidor = investidor;
    }

    public void comprar(Acao acao){
        System.out.println("Comprando " + acao.getNome());
        acao.addInvestidor(investidor);
    }

    public void vender(Acao acao){
        System.out.println("Vendendo " + acao.getNome());
        acao.removeInvestidor(investidor);
    }
}
