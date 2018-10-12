import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		try {System.out.print("Adj meg egy számot");
		int szam=beolvas.nextInt();
		boolean paros=(szam%2==0);
		if(szam%3==0) {
			if(paros) {
				System.out.println("A szám osztható kettõvel és hárommal");
			}else {
				System.out.println("A szám osztható 3-mal, de 2-vel nem");
			}
		}else {
			if(paros) {
				System.out.println("A szám osztható kettõvel és de hárommal nem");
			}else {
				System.out.println("A szám nem osztható se 3-mal, se 2-vel");
}
	
	
}
catch() {
	
	
}

		

	}

}
