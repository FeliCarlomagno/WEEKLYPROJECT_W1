package Project;

public class Audio extends Elementi implements Play {
	
	
	int volume = 10;
	int durata = 10;
	
	//COSTRUTTORE:
	public Audio(String titolo) {
		super(titolo, TipoFile.Audio);
		
	}
	
	public Audio (String titolo, int volume) {
		this(titolo);
		this.volume = volume;
	}
	
	public Audio (String titolo, int volume, int durata) {
		this(titolo,volume);
		this.durata = durata;
	}
	
	//METODI:
	public void abbassaVolume() {
		if(this.volume > 0) this.volume--;
		System.out.println("volume down, new value: " + this.volume);
	}
	
	public void alzaVolume() {
		if(this.volume < 10) this.volume++;
		System.out.println("volume up, new value: " + this.volume);
	}
	
	
	public int getDurata() {
		return this.durata;
	}
	
	public int getVolume() {
		return this.volume;
	}

	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
