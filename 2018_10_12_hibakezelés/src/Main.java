
public class Main {

	public static void main(String[] args) {
		//try {
		//	System.out.println(args[0]);
		//}catch (ArrayIndexOutOfBoundsException e){
		//	System.err.println("Adj meg értéket a tömbnek!");
		//}

		try {
			int a=Integer.parseInt(args[0]);
			int b=a/0;
			System.out.println(b);
			
		}catch (ArrayIndexOutOfBoundsException e){
			System.err.println("\nAdj meg értéket a tömbnek!");
			System.out.println("\n" + e);
		}catch (ArithmeticException e) {
			System.err.println("\nNullával osztottál!");
			System.out.println("\n" + e);
		}finally {
			System.out.println("Sok a hibád");
		}
	}
	
	

}
