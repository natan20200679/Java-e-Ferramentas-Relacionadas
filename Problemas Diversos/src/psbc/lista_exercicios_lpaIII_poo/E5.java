/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psbc.lista_exercicios_lpaIII_poo;

public class E5 {

    public static void main(String[] args) {
        
        E5_Aluno aluno = new E5_Aluno();
        
        aluno.setNome("natan");      
        System.out.println("\nAluno: " + aluno.getNome());
        
        aluno.setMatricula("005789-1");
        System.out.println("Matrícula: " + aluno.getMatricula());
        
        aluno.setNotaProva1(7);       
        System.out.println("Prova 1: " + aluno.getNotaProva1());
       
        aluno.setNotaProva2(6);        
        System.out.println("Prova 2: " + aluno.getNotaProva2());
        
        aluno.setNotaTrabalho(8);
        System.out.println("Trabalho: " + aluno.getNotaTrabalho());
       
        System.out.printf("\nMédia: %.2f", aluno.media());
        System.out.printf("\nNota Mínima Necessária Prova Final: %.2f\n", aluno.Final());
        System.out.println("");
    
    }

}
