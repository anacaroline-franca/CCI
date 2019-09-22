package cci.chapter3;

public class QueueCCI {
	Node first, last;
	
	public void enqueue(int value) {
		if (first == null) {
			first = new Node(value);
			last = first;
		} else {
			last.next = new Node(value);
			last = last.next;
		}		
	}
	
	public Node dequeue() {
		if (first != null) {
			Node removedNode = first;
			first = first.next;
			
			return removedNode;
		}
		
		return null;
	}
	
	public void printQueue() {
		Node curr = first;
		
		while(curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		QueueCCI q = new QueueCCI();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		
		q.printQueue();
	}

}
