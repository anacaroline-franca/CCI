package cci.chapter2;

/**
 * Implement an algorithm to delete a node in the middle of a single linked list, given
 * only access to that node.
 */
public class Problem3 {

	public static void solution1(Node node) {
		Node nextNode = node.next;
		node.next = nextNode.next;
		node.value = nextNode.value;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.addNode(5);
		
		solution1(linkedList.head);
		
		linkedList.printList();
	}
}
