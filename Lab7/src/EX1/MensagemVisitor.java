package EX1;

public class MensagemVisitor implements Visitor{
    @Override
    public void visit(Carro c) {
        System.out.println("CARRO: favor atualiza dados do IPVA.");
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("BIKE: comemore no parque o dia do ciclismo.");
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("ONIBUS: atencao para atualizacao das licencas.");
    }
}
