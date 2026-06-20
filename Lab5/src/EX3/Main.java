package EX3;

public class Main {
    public static void main(String[] args) {
        Prefeitura uberlandia = new Prefeitura("Uberlandia");
        Aeroporto aeroporto = new Aeroporto();

        uberlandia.update(25, 80, 45);
        aeroporto.update(25, 58, 50);
    }
}
