package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Runnable  {
	
	static String titolo = "";
	static int tipo = 0;
	static int luminosità = 0;
	static int volume = 0;
	static int durata = 0; 
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Elementi> media = new ArrayList<>();

	public static void main(String[] args) {
		
		System.out.println("STARTING PLAYER");
		
		for (int i = 0; i<5 ; i++) {
			System.out.println("\n START NEW FILE: ");
			System.out.println("Comincia inserendo il titolo: ");
			titolo = scanner.nextLine();
			System.out.println("Scegli il tipo di elemento: \n 1_Immagine, 2_Video, 3_Audio oppure 0_Exit");
			tipo = scanner.nextInt();
			scanner.nextLine();
			
			if(tipo == 1 || tipo == 2) {
				System.out.println("Scegli luminosità min: 1 max: 5");
				luminosità = scanner.nextInt();
				scanner.nextLine();
				
			}
			if (tipo == 2 || tipo == 3) {
				
				System.out.println("Seleziona livello volume. min: 1 max: 5 ");
				volume = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Seleziona durata. min: 1 max: 10 ");
				durata = scanner.nextInt();
				scanner.nextLine();
				
			} else {
				
			System.exit(0);
		    }
			
			//AGGIUNTA TIPO IN ARRAY:
		switch(tipo) {
		case 1 -> media.add(new Immagine(titolo,luminosità));
		case 2 -> media.add(new Video (titolo, volume, durata, luminosità));
		case 3 -> media.add(new Audio (titolo,5,durata));
		case 0 -> System.exit(0);
		default -> System.out.println("Nessun elemento..");
		
		}
		System.out.println("\n **ELEMENTO INSERITO CORRETTAMENTE NEL DATABASE**");
		} 
		
		
		
		
		
		//RIPRODUZUNE:
		
        int scelta = 0;
        while (true) {
            System.out.println("\n *** SCEGLI COSA RIPRODURRE (Hai 5 Elementi) 0 per uscire *** \n");
            scelta = scanner.nextInt();

if (scelta > 0 && scelta <= 5) {
    if (media.get(scelta-1) instanceof Play) {
        switch (media.get(scelta-1).getType()) {
            case Audio -> Play.play((Audio) media.get(scelta - 1));
            case Video -> Play.play((Video) media.get(scelta - 1));
        }
    } else {
        Immagine.show((Immagine) media.get(scelta-1));
		}
		} else {
		
		    System.out.println("\n *** Grazie per aver partecipato! ***");
		    System.out.println("\n *** Made with Love by Vincenzo Maiorana ***");
		    System.exit(0);
			}
        }        
			

	}

}
