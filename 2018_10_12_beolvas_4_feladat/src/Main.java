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
			
			
			if(szam1+szam2==szam3 && szam2+szam3==szam4 && szam3+szam4==szam5) {
				System.out.println("A számok Fibonacci sorozatot alkotnak");
			}else {
				System.out.println("A számok nem alkotnak Fibonacci sorozatot");
			}
				
		} catch (InputMismatchException e) {
			System.err.println("Nem számot adtál meg!");
		} catch (Exception e) {
			System.err.println("Hiba a programban");
		}
beolvas.close();
	}

}
