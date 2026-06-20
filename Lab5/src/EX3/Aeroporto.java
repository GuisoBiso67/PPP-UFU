package EX3;

public class Aeroporto implements Observer{
    @Override
    public void update(double temperatura, double umidade, double vel_vento) {
        if(vel_vento < 40){
            System.out.println("Aeroporto: Velocidade do vento normal: " + vel_vento + "KM/h");
        }
        else if(vel_vento >= 40 && vel_vento < 50){
            System.out.println("Aeroporto: Velocidade do vento relativamente alta: " + vel_vento + "KM/h");
        }
        else{
            System.out.println("Aeroporto: Velocidade do vento alta: " + vel_vento + "KM/h. Cuidado!");
        }
    }
}
