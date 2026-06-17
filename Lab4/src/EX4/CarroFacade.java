package EX4;

public class CarroFacade {
    private Motor motor;
    private CintoSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFacade(Motor motor, CintoSeguranca cinto, Porta porta,
                       Farol farol, Radio radio) {
        this.motor = motor;
        this.cinto = cinto;
        this.porta = porta;
        this.farol = farol;
        this.radio = radio;
    }

    public void dirigir(String estacaoFavorita) {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.ligar();
        radio.ligar();
        radio.sintonizar(estacaoFavorita);
    }

    public void parar() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.desligar();
        radio.desligar();
    }
}
