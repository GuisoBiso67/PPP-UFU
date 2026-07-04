package EX1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ImprimeVisitor imprime = new ImprimeVisitor();
        MensagemVisitor mensagem = new MensagemVisitor();

        List<Veiculo> veiculos = new ArrayList<>();
        Carro c = new Carro("azul", "nissan", "versa");
        veiculos.add(c);
        Bicicleta b = new Bicicleta("vermelha");
        veiculos.add(b);
        Onibus o = new Onibus(50, "2000");
        veiculos.add(o);

        for (Veiculo veiculo : veiculos){
            veiculo.accept(imprime);
            veiculo.accept(mensagem);
        }

    }
}
