package dio.retornos;

public class Quadrilatero {

    public static double area(double lado) {

        return lado * lado;
    
    }

    public static double area(double lado1, double lado2) {
        
        return lado1 * lado2;
    
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        
        return ((baseMaior + baseMenor) * altura) / 2;
    
    }

    // @author ${natan} -> Exemplo abaixo envolve modificador de acesso mais restrito (default),
    // onde apenas este pacote acessa o método abaixo, que é um exemplo de Método de Instância, 
    // diferente dos outros métodos desta classe que são Métodos Estáticos

    int codeQuadr(int code) {
        
        switch (code) {

            case 1:
                System.out.println("Quadrado");
                break;

            case 2:
                System.out.println("Retângulo");
                break;

            case 3:
                System.out.println("Losango");

            default:
                throw new AssertionError();

        }

        return code;

    }

}
