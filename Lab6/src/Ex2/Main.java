package Ex2;

import Ex1.Cafe;
import Ex1.Cappucino;
import Ex1.Cha;

public class Main {
    public static void main(String[] args){
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
