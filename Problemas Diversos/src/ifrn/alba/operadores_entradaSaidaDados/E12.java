/*
Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostra os 
dados digitados em uma única linha
 */
package alba.operadores_entradaSaidaDados;

import java.util.Scanner;

public class E12 {

    public static void main(String[] args) {
  
        System.out.print("\nDigite o nome, endereço e telefone (seguidos por vírgula mais espaço): ");
        Scanner leitor = new Scanner(System.in);
        String info = leitor.next() + leitor.nextLine();
        
        System.out.println("\n" + info + "\n");
        leitor.close();
    
    }

}
