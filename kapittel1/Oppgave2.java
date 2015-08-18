import javax.swing.JOptionPane;

public class Oppgave2 {
	public static void main(String[] args) {
		String forNavn, etterNavn; // Lange variabler får camelcase navn.
		
		forNavn = JOptionPane.showInputDialog("Oppgi fornavn: "); // Spørsmål om fornavn
		
		etterNavn = JOptionPane.showInputDialog("Og så etternavn: "); // Spørsmål om etternavn
		
		String fulltNavn = forNavn + " " + etterNavn; // Her lager jeg meg en variabel som kombinerer begge navnene og hensikten med " " er å lage et mellomrom i output
		
		String tekst = "Hei på deg " + fulltNavn; // Tekst til output med navn
		
		
		JOptionPane.showMessageDialog(null, tekst); // Output
	}
}
