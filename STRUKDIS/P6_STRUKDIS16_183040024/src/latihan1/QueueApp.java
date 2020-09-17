package latihan1;

public class QueueApp {
	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		theQueue.enqueue(10);
		theQueue.enqueue(20);
		theQueue.enqueue(30);
		theQueue.enqueue(40);
		theQueue.dequeue();
		theQueue.dequeue();
		theQueue.dequeue();
		theQueue.enqueue(50);
		theQueue.enqueue(60);
		theQueue.enqueue(70);
		theQueue.enqueue(80);
		System.out.println(theQueue.peekFront());
		while (!theQueue.isEmpty()){
			long n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	}
}

