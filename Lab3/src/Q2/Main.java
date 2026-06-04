package Q2;

public class Main {
    public static void main(String[] args) {

        CalculadoraBinaria calcBin = new CalculadoraBinaria();
        Calculadora calc = new AdapterCalculadora(calcBin);

        System.out.println("Soma: " + calc.somar(5, 3));
        System.out.println("Subtração: " + calc.subtrair(10, 4));
        System.out.println("Multiplicação: " + calc.multiplicar(6, 7));

        // esse fluxo de converte e "desconverte" é meio maluco;
    }
}
