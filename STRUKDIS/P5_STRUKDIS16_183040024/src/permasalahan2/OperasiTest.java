package permasalahan2;

import java.util.Scanner;

public class OperasiTest {

	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		while(x != 2) {
			
			System.out.println("Aplikasi Konversi infix to postfix");
			System.out.println("1.Konversi 2.exit");x = sc.nextInt();
			
			if(x == 1) {
				System.out.println("Masukkan notasi infix: ");
		        String input = sc.next();
		        Operasi operasi = new Operasi(input);
		        System.out.println("Hasil Konversi : ");
		        System.out.println(operasi.konversi());
			} else if(x != 2 || x != 1){
				System.out.println("Masukkan 1 atau 2");
			}
			
		}
		
        
    }
	
}
