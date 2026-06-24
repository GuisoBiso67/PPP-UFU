package Ex1;

abstract class CafeteriaTemplate {
    abstract void preparaBebida();
    abstract void adicionaCondimentos();

    public void aqueceAgua(){
        System.out.println("Aquecendo agua...");
    }

    public void colocaNaXicara(){
        System.out.println("Colocando bebida na xicara...");
    }

    public void preparoCompleto(String nomeBebida){
        aqueceAgua();
        preparaBebida();
        colocaNaXicara();
        adicionaCondimentos();
        System.out.println(nomeBebida + " pronto!");
    }
}
