/*
 * Dada uma lista encadeada individualmente, temos que convertê-la em uma lista encadeada circular. 
 * Por exemplo, recebemos uma lista vinculada individualmente com quatro nós e queremos converter 
 * essa lista vinculada individualmente em uma lista vinculada circular.
 */

package gfg.listaEncadeada;

public class ListaEncadeada5 {

    // Nó da lista encadeada
    static class Node {
        
        int data;
        Node next;
    
    }

    // Função que converte lista ligada simples para lista ligada circular
    static Node circular(Node head) {
    
        // Declara uma variável nó, inicia e assimila o nó topo para o nó inicial
        Node start = head;

        // Checa isso enquanto head.next não é igual a null, então o topo aponta para o
        // próximo nó
        while (head.next != null)
            head = head.next;

        // Se head.next aponta para "null", então o início assimila o nó head.next
        head.next = start;

        return start;
    
    }

    static Node push(Node head, int data) {

        // Alocação dinâmica da memória para o "newNode"
        Node newNode = new Node();

        // Assimila o dado para o "newNode"
        newNode.data = data;

        // newNode.next assimila o endereço do topo do nó
        newNode.next = (head);

        // newNode antes do topo nó
        (head) = newNode;

        return head;
    
    }

    // Função que exibe os elementos da lista ligada circular
    static void displayList(Node node) {

        Node start = node;

        while (node.next != start) {

            System.out.print(" " + node.data);
            node = node.next;

        }

        // Exibe o último nó da lista encadeada circular
        System.out.print(" " + node.data);
    
    }

    // Código controlador
    public static void main(String args[]) {

        // Inicia com lista vazia
        Node head = null;

        // Usando a função push() para conversão da lista encadeada simples 17.22.13.14.15
        head = push(head, 15);
        head = push(head, 14);
        head = push(head, 13);
        head = push(head, 22);
        head = push(head, 17);

        // Chama a função da lista circular que converte lista encadeada simples para lista encadeada
        // circular
        circular(head);

        System.out.print("\nLista =");

        displayList(head);

        System.out.println("\n");
    
    }

}