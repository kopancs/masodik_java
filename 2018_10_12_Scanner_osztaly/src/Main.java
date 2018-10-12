import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner beolvas=new Scanner(System.in);
		
		//string beolvas�sa �s ki�rat�sa, tipuskonverzi� n�lk�l, nincs hibakeres�s
		
//		System.out.print("K�rek egy sz�t: ");
//		String beolvasottadat=beolvas.nextLine();
//		System.out.println(beolvasottadat);
//		beolvas.close();

		//sz�m beolvas�sa, hbakeres�s, sz�m reciprok�nak ki�r�sa
//		try {
//			System.out.print("K�rek egy sz�mot: ");
//			int szam=beolvas.nextInt();
//			double eredmeny=(double) 1/szam;
//			System.out.println("A sz�m reciproka: ");
//			System.out.print(eredmeny);
//			}
//		catch (InputMismatchException e)
//		{
//			System.out.println("Hib�s sz�mform�tum \n Sz�mot k�rek!");
//		}
//		beolvas.close();
		
		//karakter beolvas�sa, sz�mm� konvert�l�sa, bet�b�l sz�m -> ascii k�dja
		try {
			System.out.print("K�rek egy karaktert: ");
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
	
	


