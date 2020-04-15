package tugas;

public class ListTest2 {
	public static void main(String[] args) {
		List ls = new List();
				
		ls.addHead(1);
		ls.addHead(5);
		ls.addHead(3);
		ls.addHead(6);
		ls.addHead(2);
		ls.displayElement();
		System.out.println(" ");
		System.out.println(" ");
		ls.removeTail();
		ls.displayElement();
		System.out.println(" ");
		System.out.println(" ");
		ls.removeHead();
		ls.displayElement();
		System.out.println(" ");
		System.out.println(" ");
		ls.removeTail();
		ls.displayElement();
	}
}
