import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.print("Adj meg a nap számát: ");
			int nap = (beolvas.nextInt()) - 1;

			String[] hetNapjai = { "hétfõ", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap" };
			System.out.println("A kiválasztott nap: " + hetNapjai[nap]);

		} catch (InputMismatchException e) {
			System.out.println("Nem számot adtál meg");
		} catch (Exception e) {
			System.out.println("Programfuttatási hiba");
		}

	}

}