import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner beolvas=new Scanner(System.in);
		try {
			System.out.print("1) szám: ");
			int szam1=beolvas.nextInt();
			System.out.print("2) szám: ");
			int szam2=beolvas.nextInt();
			System.out.print("3) szám: ");
			int szam3=beolvas.nextInt();
			
			int max=szam1;
			if(szam2>max) {
				max=szam2;
			}
			if(szam3>max) {
				max=szam3;
			}
			System.out.println("A legnagyobb szám: "+max);
			
			if(szam1%3==0 && szam1%3==0 && szam1%3==0) {
				System.out.println("Mindhárom szám osztható 3-mal");
			}else {
				System.out.println("Egyik szám sem osztható 3-mal");	
				}
			
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Hiba a programban");
		}

	}

}
