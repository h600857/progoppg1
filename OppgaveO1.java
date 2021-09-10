package no.hvl.dat100; //henter pakken fra skolen

import static javax.swing.JOptionPane.*; //importerer dialog bokser

public class OppgaveO1 {
	public static void main(String[] args) {
		String inntekt = showInputDialog("Bruttoinntekt: "); //tar input fra brukeren
		int i = Integer.parseInt(inntekt); //konverterer input fra String til int
		
		double sats; //bruker double siden det er desimaltall
		if (i > 0 && i <= 184800) {
			sats = 0;
		} else if (i > 184800 && i <= 260100) {
			sats = 1.7;
		} else if (i > 260100 && i <= 651250) {
			sats = 4.0;
		} else if (i > 651250 && i <= 1021550) {
			sats = 13.2;
		} else if (i > 1021550) {
			sats = 16.2; 
		} else { //else som fanger opp ugyldig input med en feilmelding popup
			showMessageDialog(null, "Ugyldig input.", "Feilmelding", ERROR_MESSAGE);
			return;
		}
		
		int skatt = (int) ((sats*i)/100); //konverterer fra double med (int)
		showMessageDialog(null, "Skattebeløp: " + skatt + "");
		
	}

}
