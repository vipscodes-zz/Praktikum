package stack;

import java.util.Scanner;

public class KelasUtama {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operasi operasi = new Operasi();
		int pilihan = 0;
		int data;
		
		
		while(pilihan != 5) {
			System.out.println("==================");
			System.out.println("Selamat Datang...");
			System.out.println("Daftar Menu");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Jumlah data Stack");
			System.out.println("4. Tampil Data");
			System.out.println("5. Keluar");
			System.out.print("Menu pilihan anda : ");
			pilihan = sc.nextInt();
			System.out.println("==================");
			switch(pilihan) {
				case 1 : 
						int jumlahData = 0;
						System.out.print("Jumlah data yang ingin dimasukkan : ");
						jumlahData = sc.nextInt();
						for (int i = 1; i <= jumlahData; i++) {
							System.out.print("Masukkan data ke-" + i + " : ");
							data = sc.nextInt();
							operasi.push(data);
						}
						 break;
				case 2 : operasi.pop(); break;
				case 3 : System.out.println(operasi.dataSize());break;
				case 4 : operasi.tampilData(); break;
			}
		}
	}
}
