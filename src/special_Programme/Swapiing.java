package special_Programme;

public class Swapiing {

	public static void main(String[] args) {

		int a=20;
		int b=30;
		System.out.println("After swapping values are .."+a+" "+b);
// Without third variable
		
		a=a+b; // 20+30=50;
		b=a-b; //50-30=20;
		a=a-b; //50-20=30;
		
		System.out.println("After swapping values are .."+a+" "+b);
		
	}

}
