/*
Dada a lista ligada circular 6->1->2->3->4->5, troque o primeiro e o último nó. A tarefa deve ser feita com 
apenas um nó extra, você não pode declarar mais de um nó extra, e também não é permitido declarar nenhuma 
outra variável temporária. Nota: Nó extra significa a necessidade de um nó percorrer uma lista. 
 */

package gfg.listaEncadeada;

public class ListaEncadeada6 {

	static class Node {

		int data;
		Node next;
	
	}

	static Node addToEmpty(Node head, int data) {

		/* Esta função é apenas para lista vazia */
		if (head != null) return head;

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

	/* Função para atravessar a lista */
	static void traverse(Node head) {

		Node p;

		/* Se a lista está vazia, retorne */
		if (head == null) {

			System.out.print("Lista está vazia.");

			return;
		
		}
		
		/* Apontando para o primeiro nó da lista */
		p = head;

		/* Atravessando a lista */
		do {

			System.out.print(p.data + " ");
			p = p.next;

		} while (p != head);
	
	}

	/* Função para permutar o primeiro e o último nó */
	static Node exchangeNodes(Node head) {

		/* Se a lista é de tamanho 2 */
		if (head.next.next == head) {

			head = head.next;

			return head;
		
		}

		/* Encontra o ponteiro para prever o último nó */
		Node p = head;

		while (p.next.next != head) p = p.next;

		/* Troca o primeiro e o último nó usando o topo e "p" */
		p.next.next = head.next;
		head.next = p.next;
		p.next = head;
		head = head.next;
		
		return head;
	
	}

	/*  Código controlador */
	public static void main(String args[]) {
		
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
