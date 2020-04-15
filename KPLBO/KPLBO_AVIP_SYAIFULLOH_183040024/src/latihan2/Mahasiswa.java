package latihan2;

public class Mahasiswa {
	private String nrp;
	private String nama;
	
	private Transkrip transkrip;
	
	public Mahasiswa(String nrp, String nama) {
		this.nrp = nrp;
		this.nama = nama;
	}
	
	public Mahasiswa(String nrp, String nama, Transkrip transkrip) {
		this(nrp, nama);
		this.transkrip = transkrip;
	}

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Transkrip getTranskrip() {
		return transkrip;
	}

	public void setTranskrip(Transkrip transkrip) {
		this.transkrip = transkrip;
	}
	
	public String display() {
		StringBuffer sb = new StringBuffer();
		sb.append("== Perspektif class Mahasiswa ==\n");
		sb.append("NRP : " + this.getNrp()+ "\n");
		sb.append("Nama : " + this.getNama()+"\n");
		sb.append("IPK : " + transkrip.getIpk()+"\n");
		sb.append("Keterangan : " + transkrip.getKeterangan() + "\n");
		return sb.toString();
	}
}
