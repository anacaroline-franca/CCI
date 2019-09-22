package cci.chapter3;

public class StackCCI {
	Node top;
	
	public Node push(int value) {
		if (top == null) {
			top = new Node(value);
		} else {
			Node newNode = new Node(value);
			newNode.next = top;
			top = newNode;
		}
		
		return top;
	}
	
	public Node pop() {
		if (top != null) {
			Node removedNode = top;
			top = top.next;
			
			return removedNode;
		}
		
		return null;
	}
	
	public void printStack() {
		Node currNode = top;
		while (currNode != null) {
			System.out.println(currNode.value);
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) {
		StackCCI s = new StackCCI();
		s.push(1);
		s.push(2);
		s.push(0);
		s.push(-1);
		s.pop();
		
		s.printStack();
	}

}
