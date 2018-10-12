import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.print("Adj meg a t�mb m�ret�t: ");
			int tombhossz=beolvas.nextInt();
			float[] szamok= new float[tombhossz];
			
			for(int i=0; i<szamok.length; i++) {
				System.out.print((i+1)+". Adj meg egy sz�mot: ");
				szamok[i]=beolvas.nextFloat();
			}
			float sum=0;
			int paros=0;
			System.out.println("A sz�mok, amiket bek�rt�nk: ");
			for(int i=0; i<szamok.length; i++) {
				System.out.print(szamok[i]+", ");
				sum=sum+szamok[i];
				if(szamok[i]%2==0) {
					paros++;
				}
			}
			float atlag=sum/tombhossz;
			System.out.println("\nA sz�mok �tlaga: "+atlag);
			System.out.println("P�ros sz�mok sz�ma: "+paros);
			System.out.println("P�ratlan sz�mok sz�ma: "+(tombhossz-paros));
			
		}catch(InputMismatchException e) {
			System.out.println("Nem sz�mot adt�l meg");
		}catch(Exception e) {
			System.out.println("Programfuttat�si hiba");
		}

	}

}