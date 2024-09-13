/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.construtores_enumerador;

import psbc.construtores_enumerador.Aluno.STATUS;

public class Construtor {

    public static void main(String[] args) {

        /* passando os dados através do construtor com sobrecarga */

        Aluno alu = new Aluno(8, 8, 8);

        /* calculando a média */

        double mediaAlunoFinal = alu.calcularMediaAluno();

        /* definindo situação do aluno */

        if (mediaAlunoFinal < 6) {

            alu.situacaoAluno = STATUS.REPROVADO;

        } else {

            alu.situacaoAluno = STATUS.APROVADO;

        }

        /* Imprimindo situação do aluno */

        System.out.println("A média do aluno é : " + alu.calcularMediaAluno() + " e o aluno está " + 
                alu.situacaoAluno);

    }

}
