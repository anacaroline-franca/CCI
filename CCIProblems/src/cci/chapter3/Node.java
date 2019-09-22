package cci.chapter3;

public class Node {
	public int value;
	public Node next = null;
	
	public Node(int value) {
		this.value = value;
		this.next = next;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
