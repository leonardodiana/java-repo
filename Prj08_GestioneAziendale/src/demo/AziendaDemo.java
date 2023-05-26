package demo;

import java.util.Scanner;

import database.DBimpiegati;
import model.Azienda;
import model.Impiegato;

public class AziendaDemo {

	public static void main(String[] args) {
		Azienda a = new Azienda();
		
		for(int c=0; c<5; c++) 
		{
			
		String nome = leggiStringa("Inserisci nome impiegato: ");
		String cognome = leggiStringa("Inserisci cognome impiegato: ");
		int eta = leggiIntero ("Inserisci età impiegato: ");
		
		Impiegato i1 = new Impiegato(nome, cognome, eta);
		i1.setStipendio(1000);
		a.addImpiegato(i1);
		}
		
		a.addImpiegato("Mario", "Rossi", 1999);
		
		System.out.println("stipendio totale + " + a.stipendioTOT());
		
		

	}

	private static int leggiIntero(String messaggio) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(messaggio);
		
		return scanner.nextInt();
	}

	private static String leggiStringa(String messaggio) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(messaggio);
		
		return scanner.nextLine();
	}
	

}
