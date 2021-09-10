package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO2 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) { //for loop	
			String poeng = showInputDialog("Antall poeng: ");
			int p;
			
			try { //bruker try/catch for å utelukke feil type input
				p = Integer.parseInt(poeng);
			} catch (Exception e) {
				showMessageDialog(null, "Ugyldig input. Må være et tall.", "Feilmelding", ERROR_MESSAGE);
				i--; //trekker fra ugyldig forsøk
				continue; //går ut en iterasjon
			}
			
			String karakter = null;
			if (p < 0 || p > 100) { //if sjekk på at tallet er gyldig
				showMessageDialog(null, "Ugyldig poengsum. Poengskalaen er fra 0 til 100.", "Feilmelding", ERROR_MESSAGE);
				i--;
				continue;
			} else if (p >= 0 && p < 40) {
				karakter = "F";
			} else if (p >= 40 && p < 50) {
				karakter = "E";
			} else if (p >= 50 && p < 60) {
				karakter = "D";
			} else if (p >= 60 && p < 80) {
				karakter = "C";
			} else if (p >= 80 && p < 90) {
				karakter = "B";
			} else if (p >= 90 && p <= 100) {
				karakter = "A";
			} 			
			showMessageDialog(null, p + " poeng tilsvarer karakter: " + karakter);
					
		}
	}
}
