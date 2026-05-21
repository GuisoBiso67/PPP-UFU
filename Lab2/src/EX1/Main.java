package EX1;

public class Main {
    public static void main(String[] args) {
        FabricanteCelular samsung_fabric = FabricanteCelularSingleton.getInstanceSamsung();
        FabricanteCelular apple_fabric = FabricanteCelularSingleton.getInstanceApple();

        Celular galaxy8_1 = samsung_fabric.constroiCelular("EX1.Galaxy8");
        Celular iphone8_1 = apple_fabric.constroiCelular("Iphone 8");

        galaxy8_1.fazLigacao();
        galaxy8_1.tiraFoto();

        iphone8_1.fazLigacao();
        iphone8_1.tiraFoto();
    }
}