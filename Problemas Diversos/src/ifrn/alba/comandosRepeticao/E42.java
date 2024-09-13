/*
Escreva um algoritmo que simule um jogo de adivinhação com a pergunta “O que é, o que é? Quanto mais 
se tira, mais a gente tem?”. O seu algoritmo deve encerrar apenas quando o usuário informar a resposta 
correta
 */

package alba.comandosRepeticao;

import java.util.Scanner;

public class E42 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nResponda a pergunta: O que é, o que é? Quanto mais se tira, mais a " + ""
                + "gente tem?(apenas com letras minúsculas): ");
        
        String resposta = leitor.next();
        
        while (resposta.equals("fotografia") == false) {
        
            System.out.println("\nResposta incorreta! Tente novamente.");
            System.out.print("\nResponda a pergunta: O que é, o que é? Quanto mais se tira, mais a " + ""
                    + "gente tem? ");
            
            resposta = leitor.next();
        
        }
        
        System.out.println("\nResposta correta! Parabéns!\n");
        leitor.close();
    
    }

}
