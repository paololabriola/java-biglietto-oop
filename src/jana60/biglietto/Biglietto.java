package jana60.biglietto;

import java.text.DecimalFormat;

public class Biglietto {

	private float prezzoPerChilometro = 0.21f, scontoGiovani = 0.2f, scontoAnziani = 0.4f;
	private int chilometriPercorsi, etaPasseggero, etaGiovani = 18, etaAnziani = 65;
	
	DecimalFormat df = new DecimalFormat(".00€");
	
	public Biglietto(int etaPasseggero, int chilometriPercorsi) {
		
		super();
		this.chilometriPercorsi = chilometriPercorsi;
		this.etaPasseggero = etaPasseggero;
		
	}

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
	
	public float calcoloPrezzoBiglietto() {
		
		 float prezzoBiglietto = chilometriPercorsi * prezzoPerChilometro;
		
		if(etaPasseggero<etaGiovani)
			return prezzoBiglietto - (prezzoBiglietto * scontoGiovani); //ticket con sconto giovani
		else if(etaPasseggero>=etaAnziani)
			return prezzoBiglietto - (prezzoBiglietto * scontoAnziani); //ticket con sconto anziani
		else 
			return prezzoBiglietto; //ticket senza sconti
		
	}
	
	public String formattaPrezzo() {
		
		 return df.format(calcoloPrezzoBiglietto());
		
	}
	
	public void stampaPrezzoBiglietto(){
				
		if(etaPasseggero<etaGiovani)
			System.out.println("Lo sconto giovani è stato applicato.");
		
		if(etaPasseggero>=etaAnziani)
			System.out.println("Lo sconto anziani è stato applicato.");
		
		System.out.println("Il costo del tuo biglietto è pari a: " + formattaPrezzo()); 
				
	}
	
}
