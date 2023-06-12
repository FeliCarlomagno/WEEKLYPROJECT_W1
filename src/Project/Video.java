package Project;

public class Video extends Elementi implements Play{
	
	int durata = 10;
	int volume = 5;
	int luminosità = 5;


	public Video(String titolo) {
		super(titolo, TipoFile.Video);
		
	}
	
	public Video(String titolo, int volume) {
	this(titolo);
	this.volume = volume;
	}
	
	public Video(String titolo, int volume, int durata) {
		this(titolo,volume);
		this.durata = durata;
	}
	
	public Video (String titolo, int volume, int durata, int luminosità) {
		this(titolo,volume,durata);
		this.luminosità = luminosità;
	}
	
	//METODI:
	
	//VOLUME
	public void alzaVolume() {
		if(this.volume < 5) this.volume++;
		System.out.println("Volume up, new Value: " +  this.volume);
		
	}
	
	public void abbassaVolume() {
		if(this.volume > 0)this.volume--;
		System.out.println("Volume down, new Value: " +  this.volume);
	}
	
	
	//LUMINOSITA'
	public void alzaLuminosità() {
		if(this.luminosità < 5) this.luminosità++;
		System.out.println("Luminosità up, new Value: " +  this.luminosità);
	}
	
	public void abbassaLuminosità() {
		if(this.luminosità < 0) this.luminosità--;
		System.out.println("Luminosità down, new Value: " +  this.luminosità);
	}
	
	public int getDurata() {
		return this.durata;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public int getLuminosità() {
		return this.luminosità;
	}
	
	public String toString() {
		
		return getTitolo() + " " + getVolume() + " " + getLuminosità();
	}

	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

}
