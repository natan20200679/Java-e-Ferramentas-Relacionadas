/*
 * Implementação da abordagem do "ListaEncadeada3".
 */

package gfg.listaEncadeada;

public class ListaEncadeada3_1 {

	private static class Node {

		public Node next;

		public Node(int data) {
		
			this.next = null;
		
		}

	}

	private Node head;

	public ListaEncadeada3_1() {
		
		head = null;
	
	}

	public void addToFront(int data) {
	
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	
	}

	public boolean isCircular() {
	
		if (head == null) {
	
			return false;
	
		}
	
		Node slow = head;
		Node fast = head.next;
	
		while (fast != null && fast.next != null) {
	
			if (slow == fast) {
	
				return true;
	
			}
	
			slow = slow.next;
			fast = fast.next.next;
	
		}
	
		return false;
	
	}

	public static void main(String[] args) {
	
		ListaEncadeada3_1 list = new ListaEncadeada3_1();
	
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		list.addToFront(4);
	
		System.out.println(list.isCircular());
	
	}
	
}