package latihan5;

public class Klasemen {
	private int main;
	private int menang;
	private int seri;
	private int kalah;
	private Tim tim;
	private int nilai;
	
	public Klasemen(Tim tim) {
		super();
		this.tim = tim;
	}
	public void tambahPertandinganTim1(Pertandingan p) {
		main++;
		if(p.getStatusTim1() == Pertandingan.MENANG) {
			menang++;
			nilai +=3;
		} else if(p.getStatusTim1() == Pertandingan.KALAH) {
			kalah++;
			nilai +=0;
		} else {
			seri++;
			nilai +=1;
		}
	}
	
	@Override
	public String toString() {
		return tim.getNama() + " # " + main + " : " + menang + " - " + seri + " - " + kalah +" : " + nilai;
	}
}
