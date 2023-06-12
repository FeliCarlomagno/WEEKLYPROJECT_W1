package Project;

public class Immagine extends Elementi {
	
	int luminosità = 5;

	public Immagine(String titolo) {
		super(titolo, TipoFile.Immagine);
		
	}
	
	public Immagine(String titolo, int luminosità) {
		this(titolo);
		this.luminosità = luminosità;
		
	}
	
	public void alzaLuminosità() {
		if (luminosità < 5) this.luminosità++;
		System.out.println("Luminosità up, new Value: " + this.luminosità);
	}
	
	public void abbassaLuminosità() {
		if(luminosità > 0) this.luminosità--;
		System.out.println("Luminosità down, new Value: " + this.luminosità);
	}
	
	public String toString() {
		return this.getTitolo();
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}
	
	public static void show(Immagine img) {
        String toPrint = img.getType() + ": " + img.getTitolo() + " | L: ";
        toPrint += Visualizzabile.printLum(img);
        System.out.println(toPrint);
}
	
	

}
