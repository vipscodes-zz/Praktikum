package permasalahan1;

import java.util.Scanner;


public class MahasiswaTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operasi operasi = new Operasi();
		int pilihan = 0;
		int data;
		Mahasiswa mahasiswa;
		String nama;
		String nrp;
		char jenisKelamin;
		while(pilihan != 3) {
			System.out.println("==================");
			System.out.println("Selamat Datang...");
			System.out.println("Daftar Menu");
			System.out.println("1. Tambah Data");
			System.out.println("2. Tampil Data");
			System.out.println("3. Keluar");
			System.out.print("Menu pilihan anda : ");
			pilihan = sc.nextInt();
			System.out.println("==================");
			switch(pilihan) {
				case 1 : 
						int jumlahData = 0;
						System.out.print("Jumlah data yang ingin dimasukkan : ");
						jumlahData = sc.nextInt();
						for (int i = 1; i <= jumlahData; i++) {
							
							System.out.println("Masukkan data ke-" + i + " : ");
							System.out.print("Masukkan NRP : "); nrp = sc.next(); 
							System.out.print("Masukkan Nama : "); nama = sc.next();
							System.out.print("Masukkan Jenis Kelamin (P/L) : "); jenisKelamin = sc.next().charAt(0);
							mahasiswa = new Mahasiswa(nrp, nama, jenisKelamin);
							operasi.addData(mahasiswa);
						}
						 break;
				case 2 : operasi.displayElement(); break;
			}
		}
	}
}
