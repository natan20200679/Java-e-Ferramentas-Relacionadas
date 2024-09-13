/*
Crie um algoritmo que simule o funcionamento de um caixa de supermercado. O caixa fica aberto até o 
fim do expediente e pode processar a compra de vários clientes. Cada cliente pode comprar vários itens. 
Ao ler cada item deve ser exibida uma mensagem para o operador do caixa perguntando se há mais itens a 
serem processados. Ao final, exiba quanto a compra custou ao cliente. E então solicite do operador do 
caixa a informação se deseja fechar o caixa. Encerre o algoritmo quando o usuário informar que deseja 
fechar o caixa
 */

package alba.comandosRepeticao;

import java.util.Objects;
import java.util.Scanner;

public class E47 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double item;
        
        double total = 0;

        System.out.print("\nIniciar nova compra? (s -> sim  n -> não)? ");
        
        String decisao = leitor.next();

        while (Objects.equals("s", decisao)) {

            System.out.print("\nValor do ítem(R$): ");
            
            item = leitor.nextDouble();
            
            total += item;
            
            System.out.print("\nAinda há ítens a serem registrados (s -> sim  n -> não)? ");
            
            decisao = leitor.next();
            
            if (Objects.equals("s", decisao)) {
            
                continue;
            
            } else {
            
                break;
            
            }
        
        }
        
        System.out.printf("\nValor Total(R$): %.2f", total);
        System.out.print("\nIniciar nova compra (s -> sim  n -> não)? ");
        
        decisao = leitor.next();
        
        System.out.println("\n");
        leitor.close();
    
    }

}
