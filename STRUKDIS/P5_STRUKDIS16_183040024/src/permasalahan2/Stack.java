package permasalahan2;

class Stack {
	private char[] dataStack = new char[10];
	private int top = -1;
	private int jmlData = 0;
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public boolean isFull() {
		return(top == 9);
	}
	
	public int dataSize() {
		jmlData = top+1;
		return(jmlData);
	}
	
	public void push(char data) {
		if(isFull()) {
			System.out.println("Stack Penuh");
		} else {
			top++;
			dataStack[top] = data;
		}
		dataSize();
	}
	
	public char pop() {
		Character temp = null;
		if(isEmpty()) {
			System.out.println("Stack masih kosong");
		} else {
			temp = dataStack[top];
			top--;
		}
		dataSize();
		return(temp);
	}
	
	public void tampilData() {
		if(!isEmpty()) {
			System.out.println("Isi Stack : ");
			for(int i = jmlData-1; i >= 0; i--) {
				System.out.println(dataStack[i]);
			}
		} else {
			System.out.println("Stack Kosong");
		}
	}
	
	public char top() {
        return dataStack[top];
    }


}
