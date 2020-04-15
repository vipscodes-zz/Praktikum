package latihan2;

public class OneToOneMain {
	public static void main(String[] args) {
		Transkrip transkrip = new Transkrip();
		transkrip.setIpk((float)3.4);
		Mahasiswa mhs = new Mahasiswa("113040100", "Iwan", transkrip);
		System.out.println(mhs.display());
		
		transkrip.setMahasiswa(mhs);
		System.out.println(transkrip.display());
		
		Transkrip transkrip2 = new Transkrip();
		transkrip2.setIpk((float)3.9);
		Mahasiswa mhs2 = new Mahasiswa("113040200", "Abdul", transkrip2);
		System.out.println(mhs2.display());
		
		transkrip2.setMahasiswa(mhs2);
		System.out.println(transkrip2.display());
	}
}
