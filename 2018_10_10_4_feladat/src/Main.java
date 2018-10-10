
public class Main {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int i=0;
		int x=a;
		for(i=1; i<a+1; i++) {
			if(a%i==0) {
				System.out.println(a+" osztója "+i);
				x--;
			}
			
		}
		if(i==1) {
			System.out.println(a+" prím szám");
		}

	}

}
