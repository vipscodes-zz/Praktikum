package latihan4;
import java.util.Scanner;
public class TotalBilanganN {
	int n;
	int angka;
	int total = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TotalBilanganN tb = new TotalBilanganN();
		System.out.print("N :"); tb.n = sc.nextInt();
		if(tb.n > 0) {
			int i = 0;
			while(i < tb.n) {
				tb.angka = sc.nextInt();
				tb.total += tb.angka;
				i++;
			}
		} else {
			System.out.println("N tidak boleh nol atau minus");
		}
		System.out.println("total = " + tb.total);
	}
}

