package Ex2;

public class Cripto extends Pedidos{
    @Override
    void tipoEntrega() {
        System.out.println("Entrega: Correios.");
    }

    @Override
    void formaPagamento() {
        System.out.println("Pagamento: online via criptomoedas.");
    }
}
