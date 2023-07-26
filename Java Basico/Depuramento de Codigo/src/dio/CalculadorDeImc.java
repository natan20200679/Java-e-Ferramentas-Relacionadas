/*
 * MENOR QUE 18,5 MAGREZA 
 * ENTRE 18,5 E 24,9 NORMAL 
 * ENTRE 25,0 E 29,9 SOBREPESO I 
 * ENTRE 30,0 E 39,9 OBESIDADE II 
 * MAIOR QUE 40,0 OBESIDADE GRAVE III
 */

package dio;

public class CalculadorDeImc {

    public Double calcula(final Pessoa pessoa) {

        final var altura = pessoa.getAltura();
        final var imc = pessoa.getPeso() / (altura * altura);
        
        return imc;

    }

}
