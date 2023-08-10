package dio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    
    @ManyToOne
    private Address endereco;

    public Long getId() {
        
        return id;
    
    }

    public void setId(Long id) {
    
        this.id = id;
    
    }

    public String getNome() {
    
        return nome;
    
    }

    public void setNome(String nome) {
    
        this.nome = nome;
    
    }

    public Address getEndereco() {
    
        return endereco;
    
    }

    public void setEndereco(Address endereco) {
    
        this.endereco = endereco;
    
    }

}
