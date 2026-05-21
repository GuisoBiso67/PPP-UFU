package EX2;

public interface IVehicleMaker {
    // Usar o padrão factory, além da facilidade de manutenção, traz a centralização da criação de objetos recorrentes;
    // Nesse exercício, se for necessário adicionar um novo tipo de veículo em algum dos modelos, seria necessário
    // criar apenas uma nova classe, sem mexer em quase nada do código. Sem isso, seria necessário criar vários
    // "new class()" espelhados, o que dificulta a manutenção e leitura do código;
    public IVehicle makeVehicle(String modelo);
}
