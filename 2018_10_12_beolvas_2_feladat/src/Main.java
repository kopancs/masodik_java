import java.util.Scanner;

public class Main {
	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		try {System.out.print("Adj meg egy sz�mot");
		int szam=beolvas.nextInt();
		boolean paros=(szam%2==0);
		if(szam%3==0) {
			if(paros) {
				System.out.println("A sz�m oszthat� kett�vel �s h�rommal");
			}else {
				System.out.println("A sz�m oszthat� 3-mal, de 2-vel nem");
			}
		}else {
			if(paros) {
				System.out.println("A sz�m oszthat� kett�vel �s de h�rommal nem");
			}else {
				System.out.println("A sz�m nem oszthat� se 3-mal, se 2-vel");
}
	
	
}
catch() {
	
	
}

		

	}

}
