/*
Exemplo de projeto baseado em https://www.youtube.com/watch?v=L07vZihvviA. A estrutura de
diretórios usada neste projeto é baseada no padrão do Maven.
*/

public class Calculadora {

    private double a, b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double soma() {
        return this.a + this.b;
    }
}
