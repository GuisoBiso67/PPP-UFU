package Ex2;

public class Online extends Pedidos{
    @Override
    void tipoEntrega() {
        System.out.println("Entrega: Correios.");
    }

    @Override
    void formaPagamento() {
        System.out.println("Pagamento: via cartao de credito.");
    }
}
