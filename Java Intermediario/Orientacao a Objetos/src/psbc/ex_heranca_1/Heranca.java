/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_heranca_1;

public class Heranca {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

			Fisica fis = new Fisica();
			fis.nome = "JOÂO";
			fis.cpf  = "11111111";
			fis.identidade = "1560455";
			fis.situacaoPessoa = "A";
			
			Juridica jur = new Juridica();
			jur.nome = "CASAS DO SILVA";
			jur.cnpj = "454577566";
			jur.inscEstadual = "45545454";
			jur.situacaoPessoa = "I";
			
			System.out.println("Dados da Pessoa Física");
			System.out.println(fis.toString());
			
			System.out.println("Dados da Pessoa Jurídica");
			System.out.println(jur.toString());
	}

}
