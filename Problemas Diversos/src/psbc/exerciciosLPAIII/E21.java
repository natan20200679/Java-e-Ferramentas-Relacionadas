/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se 
está apta ou não para cumprir o serviço militar obrigatório. Informe os totais
*/

package exerciciosLPAIII;

import java.util.Scanner;

public class E21 {

     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int N = leitor.nextInt();

        int i = 0;
        int quant_sexo_m = 0;
        int quant_sexo_f = 0;
        int quant_apta = 0;
        int quant_inapta = 0;

        while (i < N) {
            
            System.out.print("\nInforme o nome: ");
            leitor.next();

            System.out.print("Informe o sexo (m -> masculino ou f -> feminino): ");
            String sexo = leitor.next();

            switch (sexo) {

                case "m":
                    quant_sexo_m ++;
                    break;
            
                case "f":
                    quant_sexo_f ++;
                    break;
           
            }

            System.out.print("Informe a idade: ");
            int idade = leitor.nextInt();

            System.out.print("Informe a saúde (escala 0 à 5: 0 -> péssima, 5 -> ótima): ");
            int saude = leitor.nextInt();

            if (idade >= 18 && saude >= 4) {
                
                System.out.println("Pessoa Apta.");
            
                quant_apta ++;

            } else {

                System.out.println("Pessoa Inalpta.");
                
                quant_inapta ++;
            
            }

            i ++;
        
        }

        System.out.println("\nPessoas do Sexo Masculino: " + quant_sexo_m);
        System.out.println("Pessoas do Sexo Feminino: " + quant_sexo_f);
        System.out.println("Pessoas Aptas: " + quant_apta);
        System.out.println("pessoas Inaptas: " + quant_inapta);
        leitor.close();
    
     }

}
