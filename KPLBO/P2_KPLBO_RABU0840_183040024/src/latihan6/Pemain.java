package latihan6;

public class Pemain {
	private String nama;
	private int noPunggung;
	private int gajiMingguan;
	
	public Pemain() {
		nama = "";
		noPunggung = 0;
		gajiMingguan = 0;
	}
	public Pemain(String nama) {
		this.nama = nama;
		noPunggung = 0;
		gajiMingguan = 0;
	}
	public Pemain(String nama, int noPunggung) {
		this.nama = nama;
		this.noPunggung= noPunggung;
		gajiMingguan = 0;
	}
	
	public Pemain(String nama, int noPunggung, int gajiMingguan) {
		this.nama = nama;
		this.noPunggung= noPunggung;
		this.gajiMingguan = gajiMingguan;
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
	public int getGajiMingguan() {
		return gajiMingguan;
	}
	public void setGajiMingguan(int gajiMingguan) {
		this.gajiMingguan = gajiMingguan;
	}
	
	public int hitungGajiPerBulan() {
		int gajiBulanan = this.gajiMingguan;
		gajiBulanan *= 4;
		return gajiBulanan;
	}
	
	@Override
	public String toString() {
		return noPunggung + ", " + nama + "\n" + "gaji per minggu: " + gajiMingguan 
				+ "\n" + "gaji per bulan: " + hitungGajiPerBulan();
	}
}
