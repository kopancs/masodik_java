import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			
			int[] szamok= new int[10];
			
			for(int i=0; i<szamok.length; i++) {
				System.out.print((i+1)+". Adj meg egy sz�mot: ");
				szamok[i]=beolvas.nextInt();
			}
			
			System.out.println("A sz�mok, amiket bek�rt�nk: ");
			for(int i=0; i<szamok.length; i++) {
				System.out.print(szamok[i]+", ");
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Nem sz�mot adt�l meg");
		}catch(Exception e) {
			System.out.println("Programfuttat�si hiba");
		}

	}

}
