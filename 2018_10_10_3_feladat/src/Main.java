
public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int i = 0;
		for (i = a; i < b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
