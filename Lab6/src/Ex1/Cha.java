package Ex1;

public class Cha extends CafeteriaTemplate{
    @Override
    void preparaBebida() {
        System.out.println("Pegando xicara...");
        System.out.println("Pegando saquinho de sabor...");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando acucar no cafe...");
    }
}
