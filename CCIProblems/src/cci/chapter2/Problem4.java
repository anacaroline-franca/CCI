package cci.chapter2;

/**
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1’s digit is at the head of
 * he list. Write a function that adds the two numbers and returns the sum as a linked list.
 */
public class Problem4 {

	public static LinkedList solution1(Node l1, Node l2) {
		LinkedList result = new LinkedList();
		int carry = 0;
		
		while(l1 != null || l2 != null) {
			int nodeValue = carry +
					(l1 != null ? l1.value : 0) +
					(l2 != null ? l2.value : 0);
			
			carry = (nodeValue > 10) ? 1 : 0;
			nodeValue = nodeValue % 10;
			
			result.addNode(nodeValue);
			
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
		}
		
		if(carry == 1) result.addNode(1);
		
		return result;
	}
	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addNode(9);
		l1.addNode(9);
		
		LinkedList l2 = new LinkedList();
		l2.addNode(9);
		l2.addNode(9);
		
		LinkedList result = solution1(l1.head, l2.head);
		
		result.printList();
	}
}
