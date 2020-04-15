package ac.ifunpas.kplbo.uts.avipsyaifulloh;

public class PengisianBahanBakar {
	// Nama : Avip Syaifulloh
	// NRP : 183040024
	private Mobil mobil;
	public PengisianBahanBakar(Mobil mobil) {
		this.mobil = mobil;
	}
	
	public void isiBahanBakar(int bahanBakar) {
		mobil.setJmlBahanBakar(mobil.getJmlBahanBakar() + bahanBakar);
	}
	
}
