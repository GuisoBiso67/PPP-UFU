package Q4;

public class VideoProxy implements Video {

    private VideoReal videoReal;
    private String nome;

    public VideoProxy(String nome) {
        this.nome = nome;
    }

    public void play() {
        if (videoReal == null) {
            videoReal = new VideoReal(nome); // lazy loading (uso mais comum do proxy);
        }
        videoReal.play();
    }
}