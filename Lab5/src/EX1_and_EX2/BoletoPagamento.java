package EX1_and_EX2;

public class BoletoPagamento implements PagamentoStrategy{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com boleto. Valor = " + valor);
    }
}
