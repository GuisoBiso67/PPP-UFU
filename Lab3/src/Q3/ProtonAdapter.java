package Q3;

public class ProtonAdapter implements Jogo{
    private JogoWindows jogoWindows;

    public ProtonAdapter(JogoWindows jogoWindows) {
        this.jogoWindows = jogoWindows;
    }

    public void iniciar(){
        jogoWindows.startDirectX();
        System.out.println("(PROTON): Traduzindo inicializacao do directX...");
    }

    public void renderizar() {
        jogoWindows.drawFrameDX();
        System.out.println("(PROTON): Traduzindo renderizacao do directX...");
    }

    public void fechar() {
        jogoWindows.closeGameDX();
        System.out.println("(PROTON): Encerrando...");
    }
}
