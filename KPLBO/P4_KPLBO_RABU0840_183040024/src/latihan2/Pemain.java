package latihan2;

public class Pemain {
	private String nama;
	private int noPunggung;
	private int gaji; //perminggu
	
	public Pemain() {
		this("");
	}
	
	public Pemain(String nama) {
		this(nama, 0);
	}
	
	public Pemain(String nama, int noPunggung) {
		this(nama, noPunggung, 0);
	}
	
	public Pemain(String nama, int noPunggung, int gaji) {
		this.nama = nama;
		this.noPunggung = noPunggung;
		this.gaji = gaji;
	}
	
	//Method Domain
	public int hitungGajiPerBulan() {
		return gaji * 4;
	}
	
	// Method I/O
	@Override
	public String toString() {
		return noPunggung+ ", " + nama+
				"\ngaji per minggu: " + gaji+
				"\ngaji per bulan: " + hitungGajiPerBulan() +
				"\n";
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getNoPunggung() {
		return noPunggung;
	}

	public void setNoPunggung(int noPunggung) {
		this.noPunggung = noPunggung;
	}

	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
	
	
}
