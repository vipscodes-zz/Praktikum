package latihan2;

import java.util.Scanner;

public class PersegiPanjang {
	double panjang;
	double lebar;

	public double hitungLuas() {
		double luas = panjang * lebar;
		return luas;
	}

	public double hitungKeliling() {
		double keliling = panjang + panjang + lebar + lebar;
		return keliling;
	}

	public void tampil() {
		System.out.println("Panjang : " + panjang);
		System.out.println("Lebar : " + lebar);
		System.out.println("Luas : " + hitungLuas());
		System.out.println("Keliling : " + hitungKeliling());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersegiPanjang pp = new PersegiPanjang();

		System.out.print("Masukan panjang :");
		double panjang = sc.nextDouble();
		System.out.print("Masukan lebar :");
		double lebar = sc.nextDouble();
		pp.panjang = panjang;
		pp.lebar = lebar;

		System.out.println("");
		pp.tampil();
	}
}
