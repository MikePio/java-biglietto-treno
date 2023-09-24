package org. lessons. java;

import java.util. Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float prezzoPerKm = 0.21f;

		System.out.println("Calcola il prezzo del biglietto: \n- costo (" + prezzoPerKm + " euro al km) \n- 20% per i minorenni  \n- 40% per gli over 65");
		
		System.out.print("\nInserisci i km da percorrere: ");
		float kmDaPerorrere = sc.nextFloat();

		System.out.print("Inserisci l'età del passegero: ");
		int etaPasseggero = sc.nextInt();

		float prezzoSenzaSconto = kmDaPerorrere * prezzoPerKm;
		float prezzoTot = prezzoSenzaSconto;
		float scontoMinorenni = 0.20f;
		float scontoOver65 = 0.40f;

		if(etaPasseggero<18){
			prezzoTot = prezzoSenzaSconto * scontoMinorenni;
			System.out.println("Sconto per minorenni applicato");
		}else if(etaPasseggero>65){
			prezzoTot = prezzoSenzaSconto * scontoOver65;
			System.out.println("Sconto per over 65 applicato");
		}else{
			System.out.println("Nessuno sconto applicato");
		}

		String formatPrezzoTot = String.format("%.2f", prezzoTot);
		System.out.println("Prezzo totale = " + formatPrezzoTot + " euro");

		sc.close();
	}
}