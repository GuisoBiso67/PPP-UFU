package EX1_and_EX2;

public class CartaoPagamento implements PagamentoStrategy{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com cartao. Valor = " + valor);
    }
}
