import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner beolvas=new Scanner(System.in);
		int szam=0;
		int szamlalo=0;
		try {
			while(szam!=11) {	
			System.out.print("K�rek egy sz�mot: ");
			szam=beolvas.nextInt();
			szamlalo++;
			}
			System.out.println(szamlalo+". sz�mk�nt adta meg 11-et");
		}
		catch(InputMismatchException e) {
			System.out.println("Hib�s sz�mform�tum \n Sz�mot k�rek!");
		}

	}

}
