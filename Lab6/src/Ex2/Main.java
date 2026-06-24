package Ex2;

public class Main {
    public static void main(String[] args){
        // diferença entre Template e Decorator: O Template define a estrutura básica de um algoritmo numa classe,
        // permitindo que partes sejam alteradas pelas subclasses. O Decorator envolve objetos para adicionar ou
        // modificar funcionalidades dinamicamente, sem alterar a classe original;

        Online pedido_online = new Online();
        Loja pedido_loja = new Loja();
        Cripto pedido_cripto = new Cripto();

        pedido_online.processarPedido(5, 10.99);
        System.out.println("-------------------");
        pedido_loja.processarPedido(10, 112.90);
        System.out.println("-------------------");
        pedido_cripto.processarPedido(2, 5.30);


    }
}
