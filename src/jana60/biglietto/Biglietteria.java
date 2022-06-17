package jana60.biglietto;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		
		int numeroChilometri, eta;
		
		String conferma;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			do {
				
				System.out.print("Inserisci l'età del passeggero: ");
				eta = scan.nextInt();
				
				if(eta<=0)
					System.out.println("L'età non può essere pari o inferiore a 0, riprova.");
				
			}while(eta <= 0);
			
			do {
				
				System.out.print("Inserisci il numero di chilometri che deve percorrere: ");
				numeroChilometri = scan.nextInt();
				
				if(numeroChilometri<=0)
					System.out.println("Il numero di chilometri non può essere pari o inferiore a 0, riprova.");
				
			}while(numeroChilometri <= 0);
			
			scan.nextLine();
			
			Biglietto biglietto = new Biglietto(eta, numeroChilometri);
			
			biglietto.stampaPrezzoBiglietto();
		
			do {
			
				System.out.print("Vuoi acquistare un nuovo biglietto? ");
				conferma = scan.nextLine();
		
				if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
					System.out.print("Inscerisci solo Si o No.");
		
			}while(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"));
	
		}while(conferma.equalsIgnoreCase("si"));

		scan.close();
		
	}

}
