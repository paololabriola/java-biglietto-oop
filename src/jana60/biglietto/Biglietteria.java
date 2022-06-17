package jana60.biglietto;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		//Dichiarazione variabili temporanee.
		int numeroChilometri, eta;
		//Dichiarazione di una variabile conferma di tipo stringa per decidere se proseguire e ripetere il programma o se uscire dal ciclo e chiudere il programma.
		String conferma;
		//Dichiarazione variabile di tipo scanner per prendere valori in input da tastiera.
		Scanner scan = new Scanner(System.in);
		//Ciclo per ripetere il programma in base alla scelta dell'utente.
		do {
			//Ciclo di controllo affinché il valore dell'ettà inserita dall'utente sia sempre maggiore di 0.
			do {
				//Inizializzazione variabile temporanea età.
				System.out.print("Inserisci l'età del passeggero: ");
				eta = scan.nextInt();
				//Messaggio di errore qualora l'età fosse inferiore o pari a 0.
				if(eta<=0)
					System.out.println("L'età non può essere pari o inferiore a 0, riprova.");
				
			}while(eta <= 0);
			//Ciclo di controllo affinché il valore dei chilometri da percorrere inseriti dall'utente siano sempre maggiore di 0.
			do {
				//Inizializzazione variabile temporanea chilometri da percorrere.
				System.out.print("Inserisci il numero di chilometri che deve percorrere: ");
				numeroChilometri = scan.nextInt();
				//Messaggio di errore qualora i chilometri da percorrere fossero inferiori o pari a 0.
				if(numeroChilometri<=0)
					System.out.println("Il numero di chilometri non può essere pari o inferiore a 0, riprova.");
				
			}while(numeroChilometri <= 0);
			
			scan.nextLine();/* Per pulire il buffer. In alternativa avrei potuto prendendere in input nextLine e convertire poi il valore a float/int. */
			//Creazione dell'oggetto biglietto di classe Biglietto con i valori presi nelle variabili temporanee precedentemente riempite.
			Biglietto biglietto = new Biglietto(eta, numeroChilometri);
			//Richiamo metodo stampaPrezzoBiglietto dell'oggetto biglietto ereditato dalla classe Biglietto.
			biglietto.stampaPrezzoBiglietto();
			//Ciclo di controllo affinché la risposta inserita non sia diversa da si o no.
			do {
				//Richiesta di ripetere il programma e inizializzazione della variabile conferma.
				System.out.print("Vuoi acquistare un nuovo biglietto? ");
				conferma = scan.nextLine();
				//Messaggio di errore qualora la risposta fosse diversa da si o no.
				if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
					System.out.print("Inscerisci solo Si o No.");
		
			}while(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"));
		
		}while(conferma.equalsIgnoreCase("si"));/*Condizione affinché il codice si ripeta.*/
		//Chiusura dello scanner.
		scan.close();
		
	}

}
