/*
Uma escola possui um determinado número de turmas. Crie um algoritmo que leia a quantidade de turmas 
existentes na escola. Para cada turma, leia a quantidade de alunos e, para cada aluno, leia a sua média 
no semestre. Informe a média de cada uma das turmas
 */

package alba.comandosRepeticao;

import java.util.Scanner;

public class E48 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme a quantidade de turmas: ");        
        
        int turmas = leitor.nextInt();
      
        int numTurma = 1;
        double mediasAlunos = 0;
        double mediaTurma = 0;
        double mediaAluno = 0;
        
        for (int i = 1; i <= turmas; i++) {
        
            System.out.println("\n<------ Turma " + numTurma + " ------>\n");
            System.out.print("Informe a quantidade de alunos: ");
            
            int alunos = leitor.nextInt();
            
            for (int j = 1; j <= alunos; j++) {
            
                System.out.print("Informe a média semestral do próximo aluno: ");
                
                mediaAluno = leitor.nextDouble();
                mediasAlunos += mediaAluno;                
                mediaTurma = mediasAlunos / alunos;
            
            }
            
            System.out.println("\nMédia: " + mediaTurma + "\n");
            
            numTurma += 1;
        
        }
        
        leitor.close();
    
    }

}
