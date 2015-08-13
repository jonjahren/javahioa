import javax.swing.JOptionPane;

public class Hilsen {
	public static void main(String[] args) {
		String navn;
		navn = JOptionPane.showInputDialog("Oppgi navn: ");
		String utskrift;
		utskrift = "Hei på deg " + navn;
		JOptionPane.showMessageDialog(null, utskrift);
	}
}
