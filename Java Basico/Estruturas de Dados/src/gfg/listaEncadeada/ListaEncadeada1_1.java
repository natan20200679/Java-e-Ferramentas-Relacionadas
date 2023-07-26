/*
 * Método que consiste na contagem do números de nós, seguida da divisão por 2.
 */

package gfg.listaEncadeada;

public class ListaEncadeada1_1 {

    No topo;

    // Criando um novo Nó
    class No {
        
        int dado;
        No proximo;

        public No(int dado) {
        
            this.dado = dado;
            this.proximo = null;
        
        }
    
    }

    // Função para adicionar um novo Nó
    public void empurraNo(int dado) {
   
        No novoNo = new No(dado);
        novoNo.proximo = topo;
        topo = novoNo;
   
    }

    // Mostrando os elementos na lista
    public void imprimeNo() {
        
        No temp = topo;
        
        while (temp != null) {
        
            System.out.print("\n" + temp.dado + "->");
        
            temp = temp.proximo;
        
        }
        
        System.out.print("Null" + "\n");
    
    }

    // Encontrando o tamanho da lista
    public int acessTam() {
        
        int tamanho = 0;
        No temp = topo;
        
        while (temp != null) {
        
            tamanho++;
        
            temp = temp.proximo;
        
        }
        
        return tamanho;
    
    }

    // Imprimindo o elemento médio da lista
    public void imprimeMeio() {
        
        if (topo != null) {
         
            int tamanho = acessTam();
            No temp = topo;
            int meiodletamanho = tamanho / 2;
         
            while (meiodletamanho != 0) {
         
                temp = temp.proximo;
         
                meiodletamanho--;
         
            }
         
            System.out.println("\nLista Encadeada(lincada) = [1->2->3->4->5]");
            System.out.print("O elemento do meio é = [" + temp.dado + "]\n");
            System.out.println();
        
        }
    
    }

    public static void main(String[] args) {

        ListaEncadeada1_1 lista = new ListaEncadeada1_1();
        
        for (int i = 5; i >= 1; i--) {
        
            lista.empurraNo(i);
            lista.imprimeNo();
            lista.imprimeMeio();
        
        }
    
    }
    
}
