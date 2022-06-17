package jana60.biglietto;

import java.text.DecimalFormat;

public class Biglietto {
	//Attributi della classe.
	private float prezzoPerChilometro = 0.21f, scontoGiovani = 0.2f, scontoAnziani = 0.4f;
	private int chilometriPercorsi, etaPasseggero, etaGiovani = 18, etaAnziani = 65;
	//Formattazione del prezzo.
	DecimalFormat df = new DecimalFormat(".00€");
	//Costruttore.
	public Biglietto(int etaPasseggero, int chilometriPercorsi) {
		
		super();
		this.chilometriPercorsi = chilometriPercorsi;
		this.etaPasseggero = etaPasseggero;
		
	}
	//Getters n setters.
	public float getChilometriPercorsi() {
		return chilometriPercorsi;
	}

	public void setChilometriPercorsi(int chilometriPercorsi) {
		this.chilometriPercorsi = chilometriPercorsi;
	}

	public int getEtaPasseggero() {
		return etaPasseggero;
	}

	public void setEtaPasseggero(int etaPasseggero) {
		this.etaPasseggero = etaPasseggero;
	}
	//Metodi della classe.
	//Creazione del metodo per il calcolo del prezzo del biglietto con relativo sconto.
	public float calcoloPrezzoBiglietto() {
		
		 float prezzoBiglietto = chilometriPercorsi * prezzoPerChilometro;
		
		if(etaPasseggero<etaGiovani)
			return prezzoBiglietto - (prezzoBiglietto * scontoGiovani);
		else if(etaPasseggero>=etaAnziani)
			return prezzoBiglietto - (prezzoBiglietto * scontoAnziani); 
		else 
			return prezzoBiglietto; 
		
	}
	//Creazione del metodo per la formattazione del prezzo nel modo indicatogli precedentemente.
	public String formattaPrezzo() {
		
		 return df.format(calcoloPrezzoBiglietto());
		
	}
	//Creazione del metodo per la stampa del prezzo del biglietto, con eventuale messaggio di applicazione sconto.
	public void stampaPrezzoBiglietto(){
				
		if(etaPasseggero<etaGiovani)
			System.out.println("Lo sconto giovani è stato applicato.");
		
		if(etaPasseggero>=etaAnziani)
			System.out.println("Lo sconto anziani è stato applicato.");
		
		System.out.println("Il costo del tuo biglietto è pari a: " + formattaPrezzo()); 
				
	}
	
}
