package EX1_and_EX2;

import java.util.ArrayList;

public class CarrinhoCompras {
    private ArrayList<Item> carrinho;

    public CarrinhoCompras() {
        carrinho = new ArrayList<Item>();
    }

    void adicionaItem(Item item){
        carrinho.add(item);
        System.out.println(item.getNome() + " adicionado");
    }

    void removeItem(Item item){
        carrinho.remove(item);
        System.out.println(item.getNome() + " removido");
    }

    double calculaTotal(){
        double total = 0;
        for(Item item : carrinho){
            total += item.getPreco();
        }
        return total;
    }

    double calculaFrete(){
        double total = 0;
        for(Item item : carrinho){
            total += item.getPreco() *  0.1; // 10% do valor de produto;
        }
        return total;
    }

    void realizarPagamentoFrete(FreteStrategy frete, double valorFrete, PagamentoStrategy strategy){
        frete.selecionarFrete(valorFrete);
        strategy.realizarPagamento(valorFrete);
    }

    void realizarPagamento(PagamentoStrategy strategy, double valor){
         strategy.realizarPagamento(valor);
    }
}
