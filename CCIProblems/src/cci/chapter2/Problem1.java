package cci.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class Problem1 {
	
	public static LinkedList solution1(LinkedList ll) {
		Set<Integer> values = new HashSet<Integer>();
		Node currNode = ll.head;
		Node prevNode = null;
		
		while (currNode != null) {
			if (!values.contains(currNode.value)) {
				values.add(currNode.value);
				prevNode = currNode;
			} else {
				prevNode.next = currNode.next;
			}
			
			currNode = currNode.next;
		}
		
		return ll;
	}
	
	public static LinkedList bookSolution(LinkedList ll) {
		if (ll.head == null) return ll;
		
		Node prev = ll.head;
		Node curr = prev.next;
		
		while (curr != null) {
			Node runner = ll.head;
			
			while (runner != curr) {
				if (runner.value == curr.value) {
					Node tmp = curr.next;
					prev.next = tmp;
					curr = tmp;
					break;
				}
				
				runner = runner.next;
			}
			
			if (runner == curr) {
				prev = curr;
				curr = curr.next;
			}
		}
		
		return ll;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.addNode(2);
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(5);
		linkedList.addNode(9);
		linkedList.addNode(10);
		linkedList.addNode(2);
		
		LinkedList result = solution1(linkedList);
		result.printList();
				
	}
}
