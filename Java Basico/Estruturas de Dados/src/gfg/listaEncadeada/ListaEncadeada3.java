/*
 * Dada uma lista encadeada (lincada) individualmente, descubra se a lista encadeada é circular ou 
 * não.
 */

package gfg.listaEncadeada;

class ListaEncadeada3 {

	// Nó da lista lincada
	static class Node {

		int data;
		Node next;
	
	}

	// Esta função retorna "true" se a lista lincada é fornecida, senão retorna "false"
	static boolean isCircular(Node head) {

		// Uma lista lincada vazia é circular
		if (head == null)
			return true;
		
		// Próximo do topo
		Node node = head.next;
		
		// Este loop deve parar em ambos os casos (1) Se circular (2) Não circular
		while (node != null && node != head)
			node = node.next;
		
		// Se loop parou por causa da condição circular
		return (node == head);
	
	}

	// Função útil para criar um novo nó.
	static Node newNode(int data) {
	
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
	
		return temp;
	
	}

	// Código controlador
	public static void main(String args[]) {
		
		// Inicia com a lista vazia
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(3);
		head.next.next.next = newNode(4);
		
		System.out.print(isCircular(head) ? "Yes\n": "No\n");
		
		// Fazendo lista lincada circular
		head.next.next.next.next = head;
		
		System.out.print(isCircular(head) ? "Yes\n": "No\n");
	
	}

}
