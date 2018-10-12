import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner beolvas=new Scanner(System.in);
		try {
			System.out.print("1) sz�m: ");
			int szam1=beolvas.nextInt();
			System.out.print("2) sz�m: ");
			int szam2=beolvas.nextInt();
			System.out.print("3) sz�m: ");
			int szam3=beolvas.nextInt();
			
			int max=szam1;
			if(szam2>max) {
				max=szam2;
			}
			if(szam3>max) {
				max=szam3;
			}
			System.out.println("A legnagyobb sz�m: "+max);
			
			if(szam1%3==0 && szam1%3==0 && szam1%3==0) {
				System.out.println("Mindh�rom sz�m oszthat� 3-mal");
			}else {
				System.out.println("Egyik sz�m sem oszthat� 3-mal");	
				}
			
		} catch (InputMismatchException e) {
			System.err.println("Nem sz�mot adt�l meg!");
		} catch (Exception e) {
			System.err.println("Hiba a programban");
		}

	}

}
