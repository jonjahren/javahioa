 /*
  * Jeg kunne her brukt remainder operatoren % for � finne ut hvor mange hele minutter/timer etc. man f�r utifra regneoperasjonene
  * men det har seg s�nn at det ikke f�les s� viktig akkurat i denne versjonen, fordi man uansett m� gange med 60 n�r man skal
  * trekke fra for � finne ekte antall sekunder og minutter.
  *
  */

  import java.util.*;
  import javax.swing.*;

 public class Minutter {
	// Magisk nummer, you figure it out

	static int MAGIC_NUMBER = 60;

 	public static void main(String[] args) {

 	String inputSekunder = JOptionPane.showInputDialog("Oppgi sekunder  takk: ");

	// Denne konverterer en stringvariabel til heltall

 	int ekteSekunder = Integer.parseInt(inputSekunder);

	// Her regner vi ut hvor mange minutter totalt det blir utifra sekunder

	int minutter =  ekteSekunder / MAGIC_NUMBER;

	// Her regner vi ut antall timer utifra minutter

 	int antallTimer = minutter / MAGIC_NUMBER;

	// Denne operasjonen henter ut hvor mange minutter det er n�r man ser bort fra minuttene som g�r med til � utgj�re en time

	int ekteMinutter = minutter - (antallTimer * MAGIC_NUMBER);

	// Og her regner man ut det som gjenst�r av sekundene etter at minutter og timer er regnet ut

	int sekunder = ekteSekunder - (ekteMinutter * MAGIC_NUMBER) - (antallTimer * MAGIC_NUMBER * MAGIC_NUMBER);

	if(antallTimer == 0 && minutter == 0) {


		JOptionPane.showMessageDialog(null, "Antall sekunder er " + sekunder);

		}

	else if (antallTimer == 0 && ekteMinutter != 0) {

			JOptionPane.showMessageDialog(null, "Antall minutter er " + ekteMinutter + " og sekunder er " + sekunder);

		}

	else {

 	JOptionPane.showMessageDialog(null, "Antall timer er " + antallTimer + " antall minutter er " + ekteMinutter + " og sekunder er " + sekunder);

 		}

	}

 }
