package latihan2;

public class List {
	private Node HEAD;
	public void addHead(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	public boolean isEmpty() {
		if(HEAD == null) {
			return true;
		}
		return false;
	}
}
