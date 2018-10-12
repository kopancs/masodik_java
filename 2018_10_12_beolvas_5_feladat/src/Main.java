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
			System.out.print("4) szám: ");
			int szam4=beolvas.nextInt();
			System.out.print("5) szám: ");
			int szam5=beolvas.nextInt();
			
			double hanyados=(double)szam1/szam2;
			
			if(hanyados==(double)szam2/szam3 && hanyados==(double)szam3/szam4 && hanyados==(double)szam4/szam5) {
				System.out.println("A számok mértani sorozatot alkotnak");
			}else {
				System.out.println("A számok nem alkotnak mértani sorozatot");
			}
				
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Hiba a programban");
		}
beolvas.close();
	}

}
