package EX2;

public class FactoryVehicleSingleton {
    // Usar o singleton garante uma única instância de uma classe (nesse exercício, cada marca tem apenas um único objeto
    // "fábrica" que cria cada modelo. Além disso, tem o controle global de acesso a essa instância e uma grande economia
    // de recursos. O singleton evita múltiplas instâncias inconsistentes de um mesmo recurso crítico.
    private FactoryVehicleSingleton(){};

    private static IVehicleMaker toyota;
    private static IVehicleMaker honda;

    public static IVehicleMaker getInstanceToyota(){
        if (toyota == null)
            toyota = new Toyota();
        return toyota;
    }
    public static IVehicleMaker getInstanceHonda(){
        if (honda == null)
            honda = new Honda();
        return honda;
    }

}
