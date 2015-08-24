 import java.util.*;
 import javax.swing.*;

 public class Areal {
 	public static void main(String[] args) {
 	String inputRadie = JOptionPane.showInputDialog("Gi meg en radie'a?");

 	double ekteRadie = Double.parseDouble(inputRadie);

 	double areal = ekteRadie * ekteRadie * 3.14;

 	JOptionPane.showMessageDialog(null, "Arealet er " + areal);
 	}
 }

