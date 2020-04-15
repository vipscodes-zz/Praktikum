package latihan1;

public class OneToOneMain {
	public static void main(String[] args) {
		Transkrip transkrip = new Transkrip();
		transkrip.setIpk((float)3.4);
		Mahasiswa mhs = new Mahasiswa("113040100", "Iwan", transkrip);
		System.out.println(mhs.display());
		
		transkrip.setMahasiswa(mhs);
		System.out.println(transkrip.display());
	}
}
