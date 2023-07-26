/*
 * Método que consiste no uso de dois ponteiros.
 */

package gfg.listaEncadeada;

class LinkedList {
   
    No topo;

    class No {
   
        int dado;
        No proximo;

        No(int d) {
   
            dado = d;
            proximo = null;
   
        }

    }

    void imprimeMeio() {
   
        No slow_ptr = topo;
        No fast_ptr = topo;
   
        while (fast_ptr != null && fast_ptr.proximo != null) {
   
            fast_ptr = fast_ptr.proximo.proximo;
            slow_ptr = slow_ptr.proximo;
   
        }
   
        System.out.println("\nLista Encadeada(lincada) = [1->2->3->4->5]");
        System.out.println("O elemento do meio é = [" + slow_ptr.dado + "] \n");
   
    }

    // Inserir um novo nó na frente da lista
    public void push(int new_dado) {

        // 1 & 2: Aloca o nó & coloca no dado
        No novoNo = new No(new_dado);

        // 3: Faz "proximo" de "novo Nó" como topo
        novoNo.proximo = topo;

        // 4: Move o topo para apontar para o novo Nó
        topo = novoNo;

    }

    
    // Esta função imprime conteúdos da lista lincada iniciando do nó fornecido  
    public void printList() {

        No topoNo = topo;

        while (topoNo != null) {

            System.out.print("\n" + topoNo.dado + "->");

            topoNo = topoNo.proximo;

        }

        System.out.println("NULL");
    
    }

}

public class ListaEncadeada1_2 {

    public static void main(String[] args) {

        LinkedList lista = new LinkedList();

        for (int i = 5; i > 0; --i) {

            lista.push(i);
            lista.printList();
            lista.imprimeMeio();

        }
        
    }

}