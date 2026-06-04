package Q2;

public class AdapterCalculadora implements Calculadora {

    private CalculadoraBinaria calculadoraBinaria;

    public AdapterCalculadora(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    public int somar(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);

        String resultadoBin = calculadoraBinaria.somar(binA, binB);

        return Integer.parseInt(resultadoBin, 2);
    }

    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);

        String resultadoBin = calculadoraBinaria.subtrair(binA, binB);

        return Integer.parseInt(resultadoBin, 2);
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}
