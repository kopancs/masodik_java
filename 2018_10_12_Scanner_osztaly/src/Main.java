import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner beolvas=new Scanner(System.in);
		
		//string beolvasása és kiíratása, tipuskonverzió nélkül, nincs hibakeresés
		
//		System.out.print("Kérek egy szót: ");
//		String beolvasottadat=beolvas.nextLine();
//		System.out.println(beolvasottadat);
//		beolvas.close();

		//szám beolvasása, hbakeresés, szám reciprokának kiírása
//		try {
//			System.out.print("Kérek egy számot: ");
//			int szam=beolvas.nextInt();
//			double eredmeny=(double) 1/szam;
//			System.out.println("A szám reciproka: ");
//			System.out.print(eredmeny);
//			}
//		catch (InputMismatchException e)
//		{
//			System.out.println("Hibás számformátum \n Számot kérek!");
//		}
//		beolvas.close();
		
		//karakter beolvasása, számmá konvertálása, betûbõl szám -> ascii kódja
		try {
			System.out.print("Kérek egy karaktert: ");
			char karakter=beolvas.next().charAt(0);
			System.out.println("A karakter: ");
			System.out.print((int) karakter);
			}
		catch (InputMismatchException e)
		{
			System.out.println(e);
		}
		beolvas.close();
		}
		
		
		}
	
	


