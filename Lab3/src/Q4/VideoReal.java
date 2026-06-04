package Q4;

public class VideoReal implements Video {

    private String nome;

    public VideoReal(String nome) {
        this.nome = nome;
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando vídeo pesado...");
    }

    public void play() {
        System.out.println("Reproduzindo: " + nome);
    }
}
