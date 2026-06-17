package EX3;

public class Main {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Luzes luz = new Luzes();
        MaquinaPipoca pipoca = new MaquinaPipoca();
        Projetor projetor = new Projetor();
        PlayerStreaming player = new PlayerStreaming();
        Telao telao = new Telao();

        HomeTheaterFacade home = new HomeTheaterFacade(amp, luz, pipoca, projetor, player, telao);

        home.assistirFilme("Apocalypse Now");
        System.out.println("--- Fim do filme ---");
        home.fimDoFilme();
    }
}
