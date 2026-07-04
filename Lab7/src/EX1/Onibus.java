package EX1;

public class Onibus extends Veiculo{
    private int qtd_lugares;
    private String ano_fab;

    public Onibus(int qtd_lugares, String ano_fab){
        this.qtd_lugares = qtd_lugares;
        this.ano_fab = ano_fab;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public int getQtd_lugares(){
        return this.qtd_lugares;
    }

    public String getAno_fab(){
        return this.ano_fab;
    }
}
