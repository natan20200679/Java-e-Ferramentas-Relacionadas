/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.construtores_e_enumerador;

public class Aluno {

    private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
		
	public Aluno(double nota1, double nota2, double nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	// DEFININDO UM ENUMERADOR
	public enum STATUS {
		 APROVADO,
	     REPROVADO
	}

	// Método para calcular média do aluno
	public double calcularMediaAluno() {
		double mediaAluno = 0;
		// cálculo da media
		mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
		return mediaAluno;
	}
}
