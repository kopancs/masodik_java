
public class Main {

	public static void main(String[] args) {
		if(args.length>0) {
		int sum=0;
		for(int i=0; i<args.length; i++) {
			int szam=Integer.parseInt(args[i]);
			sum+=szam;			
		}
		
		System.out.println((double) sum/args.length);
		
	}
	}
}


