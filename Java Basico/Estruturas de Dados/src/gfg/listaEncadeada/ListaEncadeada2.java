/*
 * Dada uma lista encadeada individualmente e uma chave, conte o número de ocorrências da chave 
 * fornecida na lista encadeada. Por exemplo, se a lista encadeada fornecida for 1->2->1->2->1->3->1 e
 * a chave fornecida for 1, a saída deverá ser 4.
 */

package gfg.listaEncadeada;

class LinkedList {

	Node head; // Topo da lista

	// Nó da lista encadeada
	class Node {

		int data;
		Node next;

		Node(int d) {

			data = d;
			next = null;

		}

	}

	// Inserção de um novo nó à frente da lista
	public void push(int new_data) {

		// 1 & 2: Alocação do nó & colocação do dado
		Node new_node = new Node(new_data);

		// 3: Faz o próximo elemento do novo nó como topo
		new_node.next = head;

		// 4: Move o topo para a ponta do novo nó
		head = new_node;

	}

	// Conta o número de ocorrẽncias de um nó (search_for) em uma lista lincada
	// (head)
	int count(int search_for) {
	
		Node current = head;
		int count = 0;
	
		while (current != null) {
	
			if (current.data == search_for) {
	
				count++;
	
			}
	
			current = current.next;
	
		}
	
		return count;
	
	}

	// Função controladora para teste dos métodos acima
	public static void main(String args[]) {

		LinkedList llist = new LinkedList();

		// Use push() to construção da lista 1->2->1->3->1		
		llist.push(1);
		llist.push(2);
		llist.push(1);
		llist.push(3);
		llist.push(1);

		// Checando a função "count"
		System.out.println("Count of 1 is " + llist.count(1));

	}

}