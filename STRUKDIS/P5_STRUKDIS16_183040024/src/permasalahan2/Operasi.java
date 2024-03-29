package permasalahan2;


public class Operasi {
	private Stack stack = new Stack();
	private String input;
    
	public Operasi(String input) {
    	this.input = input;
    }

	public String konversi() {
        String postfix = "";
        Character top;
        for (int i = 0; i < input.length(); i++) {
        	char ch = input.charAt(i);
        	
        	//jika stack masih kosong
        	if (stack.isEmpty()) {
                stack.push(ch);
            } 
        	// jika stack memiliki data
        	else {
        		switch(ch) {
        		case '(' : 
        					stack.push(ch); 
        					break;
        		case ')' : 
        					top = stack.top();
        					while (!top.equals('(') && !stack.isEmpty()) {
        						stack.pop();
        						postfix += top.charValue();
        						if (!stack.isEmpty())
        							top = stack.top();
        						}
        					stack.pop();
        					break;
        		case '*' :
        		case '/' :  top = stack.top();
                			while (!top.equals('(') && !top.equals('+') && !top.equals('-') && !stack.isEmpty()) {
                				top = (char) stack.pop(); 
                				postfix += top.charValue();
                			}
                			stack.push(ch);
                			break;
        		case '+' :
        		case '-' : 	top = stack.top();
                			while (!top.equals('(') && !top.equals(')') && !stack.isEmpty()) {
                				top = (char) stack.pop();
                				postfix += top.charValue();
                			}
                			stack.push(ch);
                			break;
                default : 
                			postfix += ch; 
                			break;
        		}
            }
        	
        	
		}
        
        // Jika sudah semua soal sudah dibaca, pop semua isi stack dan push ke postfix sesuai dengan urutannya
        while (!stack.isEmpty()) {
            top = stack.top();
            if (!top.equals(('('))) {
                stack.pop();
                postfix += top.charValue();
            }
        }
        return postfix;
	}
	
}
