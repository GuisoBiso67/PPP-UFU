package EX3;

public class Prefeitura implements Observer {
    private String cidade;
    public Prefeitura(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void update(double temperatura, double umidade, double vel_vento) {
        if(umidade <= 30){
            System.out.println("ALERTA: " + this.cidade + ", está muito seco! Umidade: " + umidade + "%" );
        }
        else if(umidade >= 70){
            System.out.println("ALERTA: " + this.cidade + ", está muito umido! Umidade: " + umidade + "%" );
        }
        else{
            System.out.println("ALERTA: " + this.cidade + ", a umidade esta boa! Umidade: " + umidade + "%" );
        }
    }
}
