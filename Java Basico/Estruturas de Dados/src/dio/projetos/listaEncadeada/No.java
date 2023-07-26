package dio.projetos.listaEncadeada;

public class No<T> {

    private T conteudo;
    private No<T> proximoNo = null;

    public No(T conteudo){

        this.conteudo = conteudo;
    
    }

    public No(T conteudo, No<T> proximoNo) {
    
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    
    }

    public T getConteudo() {
    
        return conteudo;
    
    }

    public void setConteudo(T conteudo) {
    
        this.conteudo = conteudo;
    
    }

    public No<T> getProximoNo() {
    
        return proximoNo;
    
    }

    public void setProximoNo(No<T> proximoNo) {
    
        this.proximoNo = proximoNo;
    
    }

    @Override
    public String toString() {
    
        return "No{" + conteudo + '}';
    
    }

    public String toStringEncadeado() {
    
        String str = "No{" + conteudo + "}";

        if(proximoNo != null){
    
            str += "->" + proximoNo.toString();
    
        } else {
            
            str += "->null";
        
        }
        
        return str;
    
    }

}
