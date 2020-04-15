package latihan4;

public class Klasemen {
	private int main;
	private int menang;
	private int seri;
	private int kalah;
	private Tim tim;
	
	public Klasemen(Tim tim) {
		super();
		this.tim = tim;
	}
	public void tambahPertandinganTim1(Pertandingan p) {
		main++;
		if(p.getStatusTim1() == Pertandingan.MENANG) {
			menang++;
		} else if(p.getStatusTim1() == Pertandingan.KALAH) {
			kalah++;
		} else {
			seri++;
		}
	}
	
	@Override
	public String toString() {
		return tim.getNama() + " # " + main + " : " + menang + " - " + seri + " - " + kalah +" : N";
	}
}
