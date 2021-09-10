package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {
	public static void main(String[] args) {
		
		String heltall = showInputDialog("Heltall over 0: ");
		int h = 0;
		
		try {
			h = Integer.parseInt(heltall);
		} catch (Exception e) {
			showMessageDialog(null, "Ugyldig input. Kan ikke konverteres til heltall.", "Feilmelding", ERROR_MESSAGE);
		}

		int sum = 1;
		if (h > 0) {
			for (int i = 1; i <= h; i++) {
				sum = (sum*i);
			}
			showMessageDialog(null, h + "! = " + sum);
		}			
	}
}