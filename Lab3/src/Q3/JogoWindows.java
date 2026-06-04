package Q3;

public class JogoWindows {
    public void startDirectX() {
        System.out.println("(WINDOWS): Iniciando DirectX...");
    }

    public void drawFrameDX() {
        System.out.println("(WINDOWS): Renderizando com DirectX...");
    }

    public void closeGameDX() {
        System.out.println("(WINDOWS): Fechando jogo...");
    }

    public void jogando() {
        startDirectX();
        drawFrameDX();
        closeGameDX();
    }
}
