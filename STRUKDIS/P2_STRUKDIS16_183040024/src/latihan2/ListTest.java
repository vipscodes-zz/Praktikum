package latihan2;

public class ListTest {
	public static void main(String[] args) {
		List ls = new List();
				
		ls.addHead(2);
		ls.addHead(9);
		ls.addHead(7);
		ls.displayElement();
		System.out.println(" ");
		System.out.println(" ");
		ls.removeHead();
		ls.removeHead();
		ls.removeHead();
		ls.displayElement();
	}
}
