package Ex2;

public class Loja extends Pedidos{
    @Override
    void tipoEntrega() {
        System.out.println("Entrega: Retirar na loja.");
    }

    @Override
    void formaPagamento() {
        System.out.println("Pagamento: em dinheiro.");
    }
}
