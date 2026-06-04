package Q1;

public class Main
{
    public static void main(String[] args){
        PatoDomestico pato_domestico = new PatoDomestico();
        PavaoAzul pavao_azul = new PavaoAzul();

        AdapterPato adapterPato = new AdapterPato(pato_domestico);
        pato_domestico.voar();
        pato_domestico.grasnar();

        AdapterPavao adapterPavao = new AdapterPavao(pavao_azul);
        pavao_azul.cantar();
    }
}