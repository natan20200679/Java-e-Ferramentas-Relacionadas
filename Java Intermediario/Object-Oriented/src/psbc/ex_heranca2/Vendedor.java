/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_heranca2;

import java.util.Date;

public class Vendedor {

    private double valorComissaoPeca;
    private int totalPecasVendidas;

    public Vendedor(String nome, Date dataNascimento, String cpf, Double salario) {
        
        super();

        this.valorComissaoPeca = 10.0d;
    
    }

    public Double getSalario() {
        
        return getSalario() + (totalPecasVendidas * valorComissaoPeca);
    
    }

    public double getValorComissaoPeca() {
        
        return valorComissaoPeca;
    
    }

    public void setValorComissaoPeca(double valorComissaoPeca) {
    
        this.valorComissaoPeca = valorComissaoPeca;
    
    }

    public int getTotalPecasVendidas() {
    
        return totalPecasVendidas;
    
    }

    public void setTotalPecasVendidas(int totalPecasVendidas) {
    
        this.totalPecasVendidas = totalPecasVendidas;
    
    }

    boolean mostrarDados() {
        
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

}
