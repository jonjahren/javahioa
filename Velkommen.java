import javax.swing.JOptionPane;

public class Velkommen {
	
	public static void main(String[] args) {
		String forNavn = JOptionPane.showInputDialog("Hva er fornavnet ditt?");
		
		String etterNavn = JOptionPane.showInputDialog("Og etternavnet da, din sopp?");
		
		String alder = JOptionPane.showInputDialog("Og hvor gammal erru da?");
		
		int ekteAlder;
		
		ekteAlder = Integer.parseInt(alder);
		
		String utskrift;
		
		String fulltNavn = forNavn + " " + etterNavn;
		
		utskrift = "Halla " + fulltNavn + ". Jass�, s� du er " + ekteAlder + " �r gammel?";
		
		JOptionPane.showMessageDialog(null, utskrift);
		
			
	}

}
