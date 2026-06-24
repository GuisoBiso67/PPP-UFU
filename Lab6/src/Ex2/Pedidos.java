package Ex2;

abstract class Pedidos {

    abstract void tipoEntrega();
    abstract void formaPagamento();

    public void processarPedido(int n_itens, double preco){
        System.out.println("Total de itens: " + n_itens);
        System.out.println("Preco total: " + (n_itens*preco));
        tipoEntrega();
        formaPagamento();
    }
}
