/*
Construa um algoritmo que leia do usuário o salário e exiba uma mensagem de acordo com as seguintes
condições: se o salário for até R$ 645, escreva a mensagem “Até 1 salário mínimo; se o salário for 
acima de R$ 645 e até R$ 1935, escreva a mensagem “Até 3 salários mínimos”; se for acima de R$ 1935
e abaixo de R$ 3225, escreva a mensagem “Até 5 salários mínimos”; se for acima de R$ 3225, escreva 
a mensagem “Acima de 5 salários mínimos”
 */
package ifrn.alba.comandos_decisao;

import java.util.Scanner;

public class E21 {

    public static void main(String[] args) {
   
        System.out.print("\nInforme o salário do funcionário: ");
        
        Scanner leitor = new Scanner(System.in);
        
        double salario = leitor.nextDouble();
        
        if (salario <= 645) {
        
            System.out.println("\nAté 1 salário mínimo.");
        
        } else if (salario > 645 && salario <= 1935) {
        
            System.out.println("\nAté 3 salário mínimo.");
        
        } else if (salario > 1935 && salario < 3225) {
        
            System.out.println("\nAté 5 salário mínimo.");
        
        } else if (salario > 3225) {
        
            System.out.println("\nAcima de 5 salário mínimo.");
        
        }
        
        leitor.close();
    
    }

}
