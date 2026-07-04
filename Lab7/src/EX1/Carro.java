package EX1;

public class Carro extends Veiculo{
    private String cor;
    private String marca;
    private String modelo;

    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getCor(){
        return this.cor;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
}
