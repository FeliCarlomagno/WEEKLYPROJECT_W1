package Project;

public class Elementi {
	
	String titolo;
	TipoFile tipo;
	   
	public Elementi (String titolo, TipoFile tipo) {
		this.titolo = titolo;
		this.tipo = tipo;
	}
	
	//METODI:
	public TipoFile getType() {
		return this.tipo;
	}
	
	public String getTitolo() {
		return this.titolo;
	}

}
