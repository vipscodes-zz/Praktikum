package latihan3;
import java.util.Scanner;
public class IndeksNilaiMatkul {
	public String indeks(int nilai) {
		if(nilai >= 81 && nilai <=100) {
			return "A";
		} else if(nilai >= 76 && nilai <= 80) {
			return "AB";
		} else if(nilai >= 56 && nilai <= 75) {
			return "B";
		} else if(nilai >= 51 && nilai <= 55) {
			return "BC";
		} else if(nilai >= 41 && nilai <= 50) {
			return "C";
		} else if(nilai >= 21 && nilai <= 40) {
			return "D";
		} else if(nilai >= 0 && nilai <= 20) {
			return "E";
		} else {
			return "Nilai di luar jangkauan";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IndeksNilaiMatkul i = new IndeksNilaiMatkul();
		int nilai = 0;
		try {
			System.out.print("Masukan Nilai : "); nilai = sc.nextInt();
			System.out.println("Indeks : " + i.indeks(nilai));
			}
			catch(Exception e) {
			  System.out.println("Nilai harus diisi");
			}
	}
}
