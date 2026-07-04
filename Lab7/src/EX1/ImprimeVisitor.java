package EX1;

public class ImprimeVisitor implements Visitor{
    @Override
    public void visit(Carro c) {
        System.out.println("CARRO:- Marca: " + c.getMarca() + " | Modelo: " + c.getModelo() + " | Cor: " + c.getCor());
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("BIKE:- Cor: " + b.getCor());
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("ONIBUS:- Ano: " + o.getAno_fab() + " | Quant. Lugares: " + o.getQtd_lugares());
    }
}
