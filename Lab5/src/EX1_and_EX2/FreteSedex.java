package EX1_and_EX2;

public class FreteSedex implements FreteStrategy {
    @Override
    public void selecionarFrete(double valor) {
        System.out.println("Frete Sedex selecionado. Total = " + (valor+10));
    }
}
