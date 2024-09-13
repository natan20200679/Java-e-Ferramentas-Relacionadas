/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExerciciosLPAIIIPOO;

public class E4_Elevador {

    int andarAtual;
    int totalAndares;
    int capElevador;
    int lotacao = 0;

    public String inicializa(int capElevador, int totalAndares) {
        
        this.totalAndares = totalAndares;
        this.capElevador = capElevador;
        
        return "Elevador Inicializado";
    
    }

    public String entra() {
    
        if (lotacao < capElevador) {
        
            lotacao++;
            
            return "Acesso Permitido";
        
        } else {
        
            return "Acesso Negado. Capacidade Máxima Atingida!";
        
        }
    
    }

    public String sai() {
    
        if (lotacao > 0) {
        
            lotacao--;
            
            return "Saída Permitida";
        
        } else {
        
            return "Capacidade Máxima Disponível: " + capElevador;
        
        }
    
    }

    public String sobe() {
    
        if (totalAndares >= 10) {
        
            return "Andar Máximo Atingido!";
        
        } else {
        
            totalAndares++;
            
            return "Subindo";
        
        }
    
    }

    public String desce() {
    
        if (totalAndares <= 0) {
        
            return "Térreo Atingido";
        
        } else {
        
            totalAndares--;
            
            return "Descendo";
        
        }
    
    }

    public int getAndarAtual() {
    
        return andarAtual;
    
    }

    public void setAndarAtual(int andarAtual) {
    
        this.andarAtual = andarAtual;
    
    }

    public int getTotalAndares() {
    
        return totalAndares;
    
    }

    public void setTotalAndares(int totalAndares) {
    
        this.totalAndares = totalAndares;
    
    }

    public int getCapElevador() {
    
        return capElevador;
    
    }

    public void setCapElevador(int capElevador) {
    
        this.capElevador = capElevador;
    
    }

    public int getLotacao() {
    
        return lotacao;
    
    }

    public void setLotacao(int lotacao) {
    
        this.lotacao = lotacao;
    
    }

    @Override
    public String toString() {
    
        return "E4_Elevador [andarAtual=" + andarAtual + ", capElevador=" + capElevador + 
                ", lotacao=" + lotacao + ", totalAndares=" + totalAndares + "]";
    
    }

}
