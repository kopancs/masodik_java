
public class Main {

	public static void main(String[] args) {
		//try {
		//	System.out.println(args[0]);
		//}catch (ArrayIndexOutOfBoundsException e){
		//	System.err.println("Adj meg �rt�ket a t�mbnek!");
		//}

		try {
			int a=Integer.parseInt(args[0]);
			int b=a/0;
			System.out.println(b);
			
		}catch (ArrayIndexOutOfBoundsException e){
			System.err.println("\nAdj meg �rt�ket a t�mbnek!");
			System.out.println("\n" + e);
		}catch (ArithmeticException e) {
			System.err.println("\nNull�val osztott�l!");
			System.out.println("\n" + e);
		}finally {
			System.out.println("Sok a hib�d");
		}
	}
	
	

}
