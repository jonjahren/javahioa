 import java.util.*;
 import javax.swing.*;

 public class Alder {
 	public static void main(String[] args) {
 	String inputNavn = JOptionPane.showInputDialog("Hva heter'u?");
 	String inputAar = JOptionPane.showInputDialog("N�r erru f�dt?");

 	int ekteAar = Integer.parseInt(inputAar);

 	int alder = 2014 - ekteAar;

 	JOptionPane.showMessageDialog(null, "Hei " + inputNavn + " du er " + alder + " �r");
 	}
 }