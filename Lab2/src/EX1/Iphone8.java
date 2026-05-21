package EX1;

public class Iphone8 implements Celular{

    @Override
    public void fazLigacao(){
        System.out.println("Fazendo ligacao *som de iphone*...");
    }
    @Override
    public void tiraFoto(){
        System.out.println("*click* com mais qualidade");
    }
}
