package EX1;

public class Apple implements FabricanteCelular{

    @Override
    public Celular constroiCelular(String modelo){
        return new Iphone8();
    }
}
