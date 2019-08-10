package cci.chapter2;

import java.util.Stack;

/**
 * Implement an algorithm to find the nth to last element of a singly linked list.
 */
public class Problem2 {

	public static int solution1(Node head, int n) {
		if (head == null) return 0;
		
		int i = solution1(head.next, n) + 1;
		if (i == n) {
			System.out.println(head.value);
		}
		
		return i;
	}

	public static int solution2(Node head, int n) {
		if (head == null) return 0;

		Node p1 = head;
		Node p2 = head;
		
		while (n > 0) {
			p1 = p1.next;
			n--;
		}
		
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2.value;
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
		
		System.out.println(solution2(linkedList.head, 2));
	}
}
