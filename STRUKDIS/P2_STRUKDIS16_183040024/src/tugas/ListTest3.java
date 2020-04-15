package tugas;

public class ListTest3 {
	public static void main(String[] args) {
		List ls = new List();
				
		ls.addHead(9);
		ls.addHead(1);
		ls.addHead(8);
		ls.addHead(7);
		ls.addHead(3);
		ls.addHead(4);
		ls.displayElement();
		System.out.println(" ");
		System.out.println(" ");
		ls.removeMiddle(8);
		ls.displayElement();
		System.out.println(" ");
		System.out.println(" ");
		ls.removeMiddle(3);
		ls.displayElement();
		System.out.println(" ");
		System.out.println(" ");
		ls.removeTail();
		ls.displayElement();
		System.out.println(" ");
		System.out.println(" ");
		ls.removeMiddle(7);
		ls.addHead(2);
		ls.displayElement();
	}
}
