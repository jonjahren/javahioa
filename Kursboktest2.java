import javax.swing.*;

public class Kursboktest2 {
	public static void main(String[] args) {
		Kursbok2 bok = new Kursbok2();

		String kurs = JOptionPane.showInputDialog("Hvilket kurs går du?");

		bok.visTittel(kurs);
		}
	}