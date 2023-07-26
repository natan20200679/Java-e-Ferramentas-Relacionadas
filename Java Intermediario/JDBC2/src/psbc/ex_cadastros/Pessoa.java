/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_cadastros;

public class Pessoa {

    private int    idPessoa;
	private String nomePessoa;
	private String email;
	
	public Pessoa() {	
	}
		
	public Pessoa(String nomePessoa, String email) {
		super();
		this.nomePessoa = nomePessoa;
		this.email = email;
	}

	public Pessoa(int idPessoa, String nomePessoa, String email) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", email=" + email + "]";
	}

	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;	
	}
}
