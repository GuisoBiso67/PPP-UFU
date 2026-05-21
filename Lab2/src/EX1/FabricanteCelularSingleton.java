package EX1;

public class FabricanteCelularSingleton{
    private FabricanteCelularSingleton() {}
    private static FabricanteCelular samsung;
    private static FabricanteCelular apple;

    public static FabricanteCelular getInstanceSamsung(){
        if (samsung == null)
            samsung = new Samsung();
        return samsung;
    }

    public static FabricanteCelular getInstanceApple(){
        if (apple == null)
            apple = new Apple();
        return apple;
    }
}
