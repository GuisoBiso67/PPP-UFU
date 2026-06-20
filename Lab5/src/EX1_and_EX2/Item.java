package EX1_and_EX2;

public class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    String getNome(){
        return nome;
    }
    double getPreco(){
        return preco;
    }
}
