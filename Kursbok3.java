import javax.swing.*;

public class Kursbok3 {
	private String kursnavn;

	public void setKursNavn(String navn) {
		kursnavn = navn;
		}

	public String getKursNavn() {
		return kursnavn;
		}

	public void visTittel() {
		JOptionPane.showMessageDialog(null, "Kursbok for " + kursnavn);
		}
}