package EX3;

public class HomeTheaterFacade {
    private Amplificador amp;
    private Luzes luz;
    private MaquinaPipoca pipoca;
    private Projetor projetor;
    private PlayerStreaming player;
    private Telao telao;

    public HomeTheaterFacade(Amplificador amp, Luzes luz, MaquinaPipoca pipoca,
                             Projetor projetor, PlayerStreaming player, Telao telao) {
        this.amp = amp;
        this.luz = luz;
        this.pipoca = pipoca;
        this.projetor = projetor;
        this.player = player;
        this.telao = telao;
    }

    public void assistirFilme(String filme) {
        pipoca.ligar();
        pipoca.fazerPipoca();
        telao.abaixar();
        projetor.ligar();
        amp.ligar();
        amp.ajustarVolume(10);
        luz.desligar();
        player.ligar();
        player.play(filme);
    }

    public void fimDoFilme() {
        luz.ligar();
        player.desligar();
        projetor.desligar();
        amp.ajustarVolume(0);
        telao.subir();
        pipoca.desligar();
    }
}
