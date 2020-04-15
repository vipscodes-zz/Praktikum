package latihan1;

public class Pertandingan {
	private Tim tim1;
	private Tim tim2;
	private int skorTim1;
	private int skorTim2;

	public Pertandingan(Tim tim1, Tim tim2) {
		this.tim1 = tim1;
		this.tim2 = tim2;
	}

	public void setSkor(int skorTim1, int skorTim2) {
		this.skorTim1 = skorTim1;
		this.skorTim2 = skorTim2;
	}

	@Override
	public String toString() {
		return tim1.getNama() + " " + skorTim1 + " VS " + skorTim2 + " " + tim2.getNama() + " ";
	}
}
