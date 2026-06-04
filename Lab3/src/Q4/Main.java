package Q4;

public class Main {
    public static void main(String[] args) {
        // exemplo simplificado de streaming, para carregar filmes grandes e pesados:
        // você não baixa um filme inteiro antes de assistir;

        Video video = new VideoProxy("filme.mp4");

        // nessa ponto ainda não carregou;
        video.play(); // carrega e executa;
        video.play(); // só executa (já foi carregado);

        /*
        O padrão Proxy fornece um substituto para outro objeto, controlando o acesso a ele
        e podendo adicionar funcionalidades como o lazy loading.
         */
    }
}
