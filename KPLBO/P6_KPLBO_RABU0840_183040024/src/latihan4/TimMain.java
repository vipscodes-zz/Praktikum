package latihan4;


public class TimMain {
	public static void main(String[] args) {
		Tim tim = new Tim("Persib");

		Pemain pemain = new Pemain("I Made", 1);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Essien", 99);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Atep", 7);
		tim.tambahPemainInti(pemain);
		

		tim.tambahPemainInti(new Pemain("Febry", 22));
		
		pemain = new Pemain("Wander Luiz", 20);
		tim.tambahPemainInti(pemain);
		pemain = new Pemain("Geoffrey Catillion", 10);
		tim.tambahPemainInti(pemain);
		pemain = new Pemain("Zulham Zamrun", 17);
		tim.tambahPemainInti(pemain);
		pemain = new Pemain("Nick Kuippers", 4);
		tim.tambahPemainInti(pemain);
		pemain = new Pemain("Victor Igbonefo", 5);
		tim.tambahPemainInti(pemain);
		pemain = new Pemain("Fabiano Beltrame", 6);
		tim.tambahPemainInti(pemain);
		pemain = new Pemain("Omid Nazari", 30);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Teja Paku Alam", 33);
		tim.tambahPemainCadangan(pemain);
		pemain = new Pemain("Ezechiel Ndousel", 93);
		tim.tambahPemainCadangan(pemain);
		pemain = new Pemain("Dede Natsir", 23);
		tim.tambahPemainCadangan(pemain);
		
		System.out.println("Pemain Inti : ");
		tim.tampilPemainInti();
		
		System.out.println("Pemain Cadangan : ");
		tim.tampilPemainCadangan();
	}
}
