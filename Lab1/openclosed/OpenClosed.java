package openclosed;

public class OpenClosed {
    
    public OpenClosed(){
        doCorrectImplementation();
    }
    
    public void doIncorrectImplementation(){
        
        /**
         * Aqui temos classes Rectangle e Circle que utilizam a classe GeometryOperation 
         * para calculo da area
         */
        openclosed.incorrect.Rectangle rectangle = new openclosed.incorrect.Rectangle(4,3);
        openclosed.incorrect.Circle circle = new openclosed.incorrect.Circle(5);
        
        /**
         * Toda vez que uma nova forma geometrica eh adicionada, precisaremos de uma nova 
         * logica para calculo da area
         * Como precisaremos mudar o codigo existente (GeometryOperation), essa abordagem
         * fere o Principio do Aberto-Fechado
         */
        openclosed.incorrect.GeometryOperation op = new openclosed.incorrect.GeometryOperation();
        System.out.println("Area do retangulo -> " + op.getArea(rectangle));
        System.out.println("Area do circulo -> " + op.getArea(circle));
    }
    
    public void doCorrectImplementation(){
        openclosed.correct.Rectangle rectangle = new openclosed.correct.Rectangle(4,3);
        openclosed.correct.Circle circle = new openclosed.correct.Circle(5);

        System.out.println("Area do retangulo -> " + rectangle.getArea());
        System.out.println("Area do circulo -> " + circle.getArea());
        
        
    }
    
    public static void main(String [] args ) {
        OpenClosed opClo = new OpenClosed();
    }
    
    
}
