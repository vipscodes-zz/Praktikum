package latihan2;

public class GajiMain {
	public static void main(String[] args) {
		GajiPelatih gp1 = new GajiPelatih(2000000);
		GajiPelatih gp2 = new GajiPelatih(2000000, 10000000);
		
		System.out.println("Gaji Pelatih 1 : " + gp1.hitungGaji());
		System.out.println("Gaji Pelatih 2 : " + gp2.hitungGaji());
	}
}
