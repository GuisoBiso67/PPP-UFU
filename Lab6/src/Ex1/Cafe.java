package Ex1;

public class Cafe extends CafeteriaTemplate{
    @Override
    void preparaBebida() {
        System.out.println("Preparando coedor...");
        System.out.println("Adicionando po de cafe...");
        System.out.println("Derramando agua no coedor...");
        System.out.println("Esperando agua passar...");
        System.out.println("Pegando xicara...");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando acucar no cafe...");
    }
}
