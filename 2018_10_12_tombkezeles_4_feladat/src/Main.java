import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.print("Adj meg a nap sz�m�t: ");
			int nap = (beolvas.nextInt()) - 1;

			String[] hetNapjai = { "h�tf�", "kedd", "szerda", "cs�t�rt�k", "p�ntek", "szombat", "vas�rnap" };
			System.out.println("A kiv�lasztott nap: " + hetNapjai[nap]);

		} catch (InputMismatchException e) {
			System.out.println("Nem sz�mot adt�l meg");
		} catch (Exception e) {
			System.out.println("Programfuttat�si hiba");
		}

	}

}