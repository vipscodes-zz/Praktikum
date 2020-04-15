package tugas;

public class ListTest3 {
	public static void main(String[] args) {
		List ls = new List();
		
//		ls.addHead(2);
//		ls.addTail(4);
//		ls.addMiddle(8, 2);
//		ls.addTail(1);
//		ls.addMiddle(6, 2);
//		ls.displayElement();
		
		
		ls.addHead(2);
		ls.addTail(4);
		ls.addMiddle(8, 2);
		ls.addTail(1);
		ls.addMiddle(6, 2);
		ls.addMiddle(5, 4);
		ls.addTail(7);
		ls.displayElement();
	}
}

