/* Método que consiste na troca dos valores do primeiro e último nós. */

package gfg.listaEncadeada;

public class ListaEncadeada6_1 {

    static class Node {

        int data;
        Node next;
    
    }

    static Node addToEmpty(Node head, int data) {

        /* Esta função é apenas para lista vazia */
        if (head != null)
            return head;
        
        /* Criando um nó dinamicamente */
        Node temp = new Node();
        
        /* Assimilando o dado */
        temp.data = data;
        head = temp;
        
        /* Criando a ligação */
        head.next = head;
        
        return head;
    
    }

    static Node addBegin(Node head, int data) {

        if (head == null) {

            return addToEmpty(head, data);

        }

        Node temp = new Node();
        temp.data = data;
        temp.next = head.next;
        head.next = temp;
        
        return head;
    
    }

    /*  Função para atravessar a lista */
    static void traverse(Node head) {

        Node p;

        /* Se a lista está vazia, retorne */
        if (head == null) {

            System.out.print("\nLista está vazia." + "\n");

            return;
        
        }

        /* Apontando para o primeiro nó da lista */
        p = head;

        /* Apontando para o primeiro nó da lista */
        do {

            System.out.print(p.data + " ");

            p = p.next;

        } while (p != head);
    
    }

    /* Função para trocar o primeiro e o último nó */
    static Node exchangeNodes(Node head) {

        /* Se a lista é de tamanho menor do que 2 */
        if (head == null || head.next == null) {

            return head;
        
        }

        Node tail = head;

        /* Encontra o ponteiro do último nó */
        while (tail.next != head) {
           
            tail = tail.next;
        
        }

        /* 
        Troca o primeiro e o último nó usando o topo e "p". Variável temporária para armazenar o dado do 
        topo 
        */
        int temp = tail.data;
        tail.data = head.data;
        head.data = temp;

        return head;
   
    }

    /* Programa controlador */
    public static void main(String[] args) {

        int i;

        Node head = null;
        head = addToEmpty(head, 6);

        for (i = 5; i > 0; i--) {

            head = addBegin(head, i);
        
        }

        System.out.print("\nLista = ");

        traverse(head);

        System.out.println();
        System.out.print("Lista após troca = ");

        head = exchangeNodes(head);

        traverse(head);

        System.out.println("\n");
    
    }

}