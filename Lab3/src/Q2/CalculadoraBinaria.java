package Q2;

public class CalculadoraBinaria {

    public String somar(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int resultado = num1 + num2;
        return Integer.toBinaryString(resultado);
    }

    public String subtrair(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int resultado = num1 - num2;
        return Integer.toBinaryString(resultado);
    }
}
