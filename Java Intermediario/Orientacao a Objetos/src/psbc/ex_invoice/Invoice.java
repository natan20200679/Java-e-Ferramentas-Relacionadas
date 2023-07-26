/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_invoice;

public class Invoice {

    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
//        this.setCodigoItem (codigoItem);
//        this.setDescricao (descricao);
//        this.setQuantidade (quantidade);
//        this.setPrecoUnitario (precoUnitario);

        this.codigoItem = codigoItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
   
    public double getInvoiceAmount() {
        
        return quantidade * precoUnitario;
        
    }
    
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        
        if (quantidade < 0) {
            
            this.quantidade = 0;
            
        } else {
            
            this.quantidade = quantidade;
            
        }    
    
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        
        if (precoUnitario < 0) {
            
            this.precoUnitario = 0;
            
        } else {
            
            this.precoUnitario = precoUnitario;

        }    
    
    }
}
