package cci.chapter2;

public class LinkedList {

	public Node head;
	
	public Node addNode(int value)
	{
		Node newNode = new Node(value, null);
		
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node last = this.head;
			while (last.next != null) {
				last = last.next;
			}
			
			last.next = newNode;
		}
		
		return this.head;
	}

	public Node deleteNode(int value)
	{
		Node currNode = this.head;
		Node prev = null;
		
		if (currNode != null && currNode.value == value) {
			this.head = this.head.next;
			return this.head;
		}
		
		while(currNode != null && currNode.value != value) {
			prev = currNode;
			currNode = currNode.next;
		}
		
		if (currNode != null) {
			prev.next = currNode.next;
		}
		
		if (currNode == null) {
			System.out.println("Value not found!");
		}
		
		return this.head;
	}
	
	public void printList() {
		Node currNode = this.head;
		
		while (currNode != null) {
			System.out.println(currNode.value);
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		
		linkedList.deleteNode(2);
		
		linkedList.printList();
	}
}
