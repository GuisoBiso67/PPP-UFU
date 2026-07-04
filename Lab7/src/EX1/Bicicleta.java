package EX1;

public class Bicicleta extends Veiculo{
    private String cor;
    public Bicicleta(String cor){
        this.cor = cor;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getCor(){
        return this.cor;
    }
}
