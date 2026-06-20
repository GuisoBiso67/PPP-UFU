package EX1_and_EX2;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Conjunto de Panelas", 399.90);
        Item item2 = new Item("Taças para Vinho", 100.00);
        Item item3 = new Item("Kit Completo de Ferramentas", 589.99);

        CarrinhoCompras compras = new CarrinhoCompras();
        compras.adicionaItem(item1);
        compras.adicionaItem(item2);
        compras.adicionaItem(item3);

        double total = compras.calculaTotal();

        PagamentoStrategy pagamento = new CartaoPagamento();
        compras.realizarPagamento(pagamento, total);

        double total_frete = compras.calculaFrete();
        FreteStrategy frete = new FreteSedex();
        compras.realizarPagamentoFrete(frete, total_frete, pagamento);

    }
}
