import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.print("Adj meg a tömb méretét: ");
			int tombhossz=beolvas.nextInt();
			float[] szamok= new float[tombhossz];
			
			for(int i=0; i<szamok.length; i++) {
				System.out.print((i+1)+". Adj meg egy számot: ");
				szamok[i]=beolvas.nextFloat();
			}
			float sum=0;
			int paros=0;
			System.out.println("A számok, amiket bekértünk: ");
			for(int i=0; i<szamok.length; i++) {
				System.out.print(szamok[i]+", ");
				sum=sum+szamok[i];
				if(szamok[i]%2==0) {
					paros++;
				}
			}
			float atlag=sum/tombhossz;
			System.out.println("\nA számok átlaga: "+atlag);
			System.out.println("Páros számok száma: "+paros);
			System.out.println("Páratlan számok száma: "+(tombhossz-paros));
			
		}catch(InputMismatchException e) {
			System.out.println("Nem számot adtál meg");
		}catch(Exception e) {
			System.out.println("Programfuttatási hiba");
		}

	}

}