package ac.ifunpas.kplbo.uts.avipsyaifulloh;

public class PengisianBahanBakarMain {
	public static void main(String[] args) {
		Mobil mobil = new Mobil();
		mobil.setNoPol("D123AA");
		mobil.setMerk("Ferrari");
		mobil.setJmlBahanBakar(20);
		
		PengisianBahanBakar pengisianBahanBakar = new PengisianBahanBakar(mobil);
		pengisianBahanBakar.isiBahanBakar(10);
		
		System.out.println(mobil.getJmlBahanBakar());
	}
	
}
