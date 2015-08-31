import java.util.Scanner;

public class inputExempel {

	public static void main(String[] args) {
		String navn, etterNavn;
		int i = 100;
		System.out.println("Hva er fornavnet ditt?");

		Scanner forNavn = new Scanner(System.in);

		navn = forNavn.nextLine();

		System.out.println("Og hva er etternavnet?");

		Scanner ekteEtterNavn = new Scanner(System.in);

		etterNavn = ekteEtterNavn.nextLine();

		String fulltNavn = navn + " " + etterNavn;

		System.out.println("Hei " + fulltNavn + " " + i);
	}
}