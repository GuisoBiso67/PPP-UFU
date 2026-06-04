package Q3;

public class Main {
    public static void main(String[] args) {
        /*
        Para "traduzir" jogos de Windows para Linux, é necessário uma ferramenta chamada Proton. Essa foi minha ideia:
        o Proton é um adapter para fazer jogos de Windows serem compatíveis com Linux;
         */
        JogoWindows jogoW = new JogoWindows();

        jogoW.jogando();
        System.out.println("------------------------------");

        Jogo jogoAdaptado = new ProtonAdapter(jogoW);

        Linux linux = new Linux();
        linux.jogando(jogoAdaptado);
    }
}
