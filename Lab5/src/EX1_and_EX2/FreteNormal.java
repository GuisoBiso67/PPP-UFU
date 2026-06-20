package EX1_and_EX2;

public class FreteNormal implements FreteStrategy {
    @Override
    public void selecionarFrete(double valor) {
        System.out.println("Frete normal selecionado. Total = " + (valor+20));
    }
}
