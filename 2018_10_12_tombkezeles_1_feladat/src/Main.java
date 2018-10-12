import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			
			int[] szamok= new int[10];
			
			for(int i=0; i<szamok.length; i++) {
				System.out.print((i+1)+". Adj meg egy számot: ");
				szamok[i]=beolvas.nextInt();
			}
			
			System.out.println("A számok, amiket bekértünk: ");
			for(int i=0; i<szamok.length; i++) {
				System.out.print(szamok[i]+", ");
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Nem számot adtál meg");
		}catch(Exception e) {
			System.out.println("Programfuttatási hiba");
		}

	}

}
