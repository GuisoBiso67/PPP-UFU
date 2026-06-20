package EX1_and_EX2;

public class PixPagamento implements PagamentoStrategy {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com pix. Valor = " + valor);
    }
}
