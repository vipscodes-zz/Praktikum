package latihan3;

public class KartuATM extends KartuElektronik{
	
	
	public KartuATM(String kodeBank, String PIN) {
		super(kodeBank, PIN);
	}

	@Override
	public String encode(String PIN) {
		return PIN.concat("X");
	}

}
