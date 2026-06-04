package Q1;

public class AdapterPato implements Ave{
    private Pato pato;
    public AdapterPato(Pato p) {
        this.pato = p;
    }
    public void voar() {
        pato.voar();
    }
    public void emitirSom() {
        pato.grasnar();
    }
}
