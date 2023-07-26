/*
 * Dada uma lista encadeada circular, conte o número de nós nela. Por exemplo, a saída é 5 para uma 
 * lista cujo topo é 1. 
 */

package gfg.listaEncadeada;

public class ListaEncadeada4 {

    // Uso de um nó
    static class Node {
        
        int data;
        Node next;
    
    }

    // Função para inserir um nó no início de uma lista encadeada circular
    static Node push(Node head_ref, int data) {

        Node ptr1 = new Node();
        Node temp = head_ref;
        ptr1.data = data;
        ptr1.next = head_ref;
        
        // Se a lista lincada não é nula, então define o próximo elemento do último nó
        if (head_ref != null) {

            while (temp.next != head_ref) {
            
                temp = temp.next;
            
            }
            
            temp.next = ptr1;
        
        } else {
        
            ptr1.next = ptr1; // Para o primeiro nó
        
        }

        head_ref = ptr1;
        
        return head_ref;
    
    }

    // Função para imprimir nós na lista encadeada Circular fornecida
    static int countNodes(Node head) {
        
        Node temp = head;
        int result = 0;
        
        if (head != null) {
        
            do {
        
                temp = temp.next;
        
                result++;
        
            } while (temp != head);
        
        }
        
        return result;
    
    }

    // programa direcionador para testar as funções acima
    public static void main(String args[]) {

        // Inicializa as listas como vazias
        Node head = null;
        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);
        
        System.out.printf("\nNúmero de nós: %d", countNodes(head), "\n");
        System.out.println("\n");
    
    }

}