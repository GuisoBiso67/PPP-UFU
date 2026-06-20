package EX4;

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String nome;
    private double preco;
    private List<Observer> investidores;

    public Acao(String nome) {
        this.nome = nome;
        this.investidores = new ArrayList<>();
    }

    public void addInvestidor(Observer o) {
        investidores.add(o);
    }

    public void removeInvestidor(Observer o) {
        investidores.remove(o);
    }

    public void setPreco(double preco) {
        this.preco = preco;
        notifyObservers();
    }

    private void notifyObservers() {
        List<Observer> copia = new ArrayList<>(investidores);

        for (Observer o : copia) {
            o.update(preco);
        }
    }

    public String getNome() {
        return nome;
    }
}
