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
			System.out.print("4) sz�m: ");
			int szam4=beolvas.nextInt();
			System.out.print("5) sz�m: ");
			int szam5=beolvas.nextInt();
			
			
			if(szam1+szam2==szam3 && szam2+szam3==szam4 && szam3+szam4==szam5) {
				System.out.println("A sz�mok Fibonacci sorozatot alkotnak");
			}else {
				System.out.println("A sz�mok nem alkotnak Fibonacci sorozatot");
			}
				
		} catch (InputMismatchException e) {
			System.err.println("Nem sz�mot adt�l meg!");
		} catch (Exception e) {
			System.err.println("Hiba a programban");
		}
beolvas.close();
	}

}
