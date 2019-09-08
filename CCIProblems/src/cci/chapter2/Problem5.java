package cci.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a circular linked list, implement an algorithm which returns
 * node at the beginning of the loop.
 */
public class Problem5 {

	public static Node solution1(Node l1) {
		Set<Node> set = new HashSet<Node>();
		
		while(l1 != null) {
			if(set.contains(l1)) {
				return l1;
			}
			
			set.add(l1);
			l1 = l1.next;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addNode(7);
		l1.addNode(8);
		l1.addNode(9);
		l1.addNode(10);
		
		l1.head.next.next = l1.head.next;
		
		Node result = solution1(l1.head);
		
		System.out.println(result.value);
	}
}
