	import javax.swing.*;

public class Test {

public static void main(String[] args) {
JTextField Fornavn = new JTextField();
JTextField Etternavn = new JTextField();
JTextField Alder = new JTextField();
Object[] message = {
    "Fornavn:", Fornavn,
    "Etternavn:", Etternavn,
    "Alder:", Alder
};

int option = JOptionPane.showConfirmDialog(null, message, "Oppgi personalia", JOptionPane.OK_CANCEL_OPTION);
if (option == JOptionPane.OK_OPTION) {
    String firstName = Fornavn.getText();
    String lastName = Etternavn.getText();
    String age = Alder.getText();
    int realAge = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, firstName + " " + lastName + " " + realAge);

} else {
    JOptionPane.showMessageDialog(null, "Neivel");

}

}

}