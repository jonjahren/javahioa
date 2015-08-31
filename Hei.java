import javax.swing.JOptionPane;

public class Hei {
	public static void main(String[] args) {
		String navn = JOptionPane.showInputDialog("Hva er navnet ditt?");
		JOptionPane.showMessageDialog(null, "Hei " + navn);
		}
	}