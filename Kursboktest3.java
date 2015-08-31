import javax.swing.*;

public class Kursboktest3 {
	public static void main(String[] args) {
		Kursbok3 bok = new Kursbok3();

		JOptionPane.showMessageDialog(null, "Opprinnelig kursnavn: " + bok.getKursNavn());

		String navn = JOptionPane.showInputDialog("Oppgi kurset du går på: ");

		bok.setKursNavn(navn);

		JOptionPane.showMessageDialog(null, "Registrert kursnavn: " + bok.getKursNavn());

		bok.visTittel();
	}
}