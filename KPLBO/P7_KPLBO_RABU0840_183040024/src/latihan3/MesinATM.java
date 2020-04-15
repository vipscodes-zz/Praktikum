package latihan3;

public class MesinATM {
	private Kartu kartu;
	private boolean otentikasi = false;
	
	public void cekPIN(Kartu kartu, String pin) {
		if(validasiKartu(kartu)) {
			if(kartu.otentikasi(pin)) {
				otentikasi = true;
				this.kartu = kartu;
			} else {
				otentikasi = false;
			}
		}
	}
	
	public boolean validasiKartu(Kartu kartu) {
		return true;
	}

	public void tarikTunai() {
		if(otentikasi == true) {
			System.out.println("Tarik tunai menggunakan Kartu "
				.concat(kartu instanceof KartuATM ? "ATM!" : "Kredit!"));
		} else {
			System.out.println("Tarik tunai gagal");
		}
	}
}