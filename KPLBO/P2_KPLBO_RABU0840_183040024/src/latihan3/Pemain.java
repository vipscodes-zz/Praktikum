package latihan3;

public class Pemain {
	private String nama;
	private int noPunggung;

	public Pemain() {
		nama = "";
		noPunggung = 0;
	}
	public int getNoPunggung() {
		return noPunggung;
	}

	public void setNoPunggung(int noPunggung) {
		this.noPunggung = noPunggung;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	@Override
	public String toString() {
		return noPunggung + ", " + nama;
	}
}
