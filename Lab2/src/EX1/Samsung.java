package EX1;

public class Samsung implements FabricanteCelular{

    @Override
    public Celular constroiCelular(String modelo){
        return new Galaxy8();
    }
}
