package latihan1;

public class Transkrip {
	private float ipk;
	private Mahasiswa mahasiswa;
	
	public String getKeterangan() {
		if(ipk > 3.5)
			return "Cumlaude";
		else if (ipk >3.0)
			return "Excellent";
		else if (ipk > 2.5)
			return "Good";
		else
			return "Not Good";
	}

	public float getIpk() {
		return ipk;
	}

	public void setIpk(float ipk) {
		this.ipk = ipk;
	}

	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}
	public String display() {
		StringBuffer sb = new StringBuffer();
		sb.append("== Perspektif class Transkrip ==\n");
		sb.append("NRP : " + mahasiswa.getNrp()+ "\n");
		sb.append("Nama : " + mahasiswa.getNama()+"\n");
		sb.append("IPK : " + this.getIpk()+"\n");
		sb.append("Keterangan : " + this.getKeterangan() + "\n");
		return sb.toString();
	}
	
}
