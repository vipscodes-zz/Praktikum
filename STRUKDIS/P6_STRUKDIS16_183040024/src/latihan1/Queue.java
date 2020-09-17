package latihan1;

class Queue { 
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	private long[] queArray;
	public Queue(int size) {
		this.maxSize = size;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void enqueue(long value) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queArray[++rear] = value;
		nItems++;
	}
	
	public long dequeue() {
		long temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int size() {
		return nItems;
	}

	public long remove() {
		return 0;
	}

}

