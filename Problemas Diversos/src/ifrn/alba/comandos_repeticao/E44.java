/*
Escreva um algoritmo que leia a quantidade de alunos em uma turma. Em seguida, para cada aluno, 
leia a informação de suas 2 notas, calcule a média e informe se o aluno está aprovado ou reprovado.
O aluno está aprovado apenas se a sua média for maio ou igual a 6
 */
package ifrn.alba.comandos_repeticao;

import java.util.Scanner;

public class E44 {

    public static void main(String[] args) {
   
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("\nInforme a quantidade de alunos da turma: ");
        
        int quant = leitor.nextInt();
        int i = 0;
        
        while (i < quant) {
        
            System.out.print("Informe a nota 1 do aluno: ");
            double nota_1 = leitor.nextDouble();
            
            System.out.print("Informe a nota 2 do aluno: ");
            double nota_2 = leitor.nextDouble();
            
            double media = (nota_1 + nota_2) / 2;
            
            if (media >= 6) {
            
                System.out.println("\nAprovado!\n");
            
            } else {
            
                System.out.println("\nReprovado!\n");
            
            }
        
        }
        
        leitor.close();
    
    }

}
