
public class Main {

	public static void main(String[] args) {
		int a =Integer.parseInt(args[0]);
		int sum=0;
		int i=1;
		for(i=1; i<a; i++) {
			if(a%i==0){
				sum=sum+i;
				}
			}
		if(sum==a) {
			System.out.println(a+" tökéletes szám");}
		else {
			System.out.println(a+" nem tökéletes szám");
		}
		}
	

	}


