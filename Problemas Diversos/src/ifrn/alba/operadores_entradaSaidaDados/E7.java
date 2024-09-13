/* Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado
 */

package alba.operadores_entradaSaidaDados;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite o salário do funcionário (R$): ");
        
        double salario = leitor.nextDouble();

        double reajuste = 0.07;

        double salario_reaj = salario + (salario * reajuste);

        System.out.print("O salário reajustado é (R$): " + salario_reaj);

        System.out.println("\n");
        leitor.close();

    }

}
