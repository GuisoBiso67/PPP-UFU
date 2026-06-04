package Q1;

public class AdapterPavao implements Ave{
    private Pavao pavao;
    public AdapterPavao(Pavao p) {
        this.pavao = p;
    }
    public void voar() {
        System.out.println("Pavao nao voa");
    }
    public void emitirSom() {
        pavao.cantar();
    }
}
