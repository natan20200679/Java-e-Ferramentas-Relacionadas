/*
 * Método que consiste no uso de recursão.
 */

package gfg.listaEncadeada;

// Representa o nó de uma lista encadeada
class Node {

    int data;
    Node next;

    Node(int val) {

        data = val;
        next = null;

    
    }
}

class ListaEncadeada2_1 {

    // variável global para contar a frequência de um elemento k fornecido
    static int frequency = 0;

    // Fornecida uma referência (apontador para apontador) para o topo de uma lista e um inteiro, 
    // empurra um novo nó à frente da lista
    static Node push(Node head, int new_data) {

        // alocação do nó
        Node new_node = new Node(new_data);

        // Liga a lista antiga do novo nó
        new_node.next = head;

        // Move o topo para a ponta do novo nó
        head = new_node;

        return head;
    
    }

    // Conta o número de ocorrẽncias de um nó (search_for) em uma lista lincada (head)
    static int count(Node head, int key) {

        if (head == null) {

            return frequency;
        
        }
        
        if (head.data == key) {
        
            frequency++;
        
        }
        
        return count(head.next, key);
    
    }

    // Código direcionador
    public static void main(String args[]) {
    
        // Inicia com a lista vazia
        Node head = null;
    
        // Usa push() para construção da lista 1->2->1->3->1
        head = push(head, 1);
        head = push(head, 3);
        head = push(head, 1);
        head = push(head, 2);
        head = push(head, 1);
        
        // Verifica a função "count"
        System.out.print("Contagem de 1's é: " + count(head, 1) + "\n");
    
    }

}