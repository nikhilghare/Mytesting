package logical_programme;

public class Factorial_No {

	public static void main(String[] args) {
   // No =5! 5*4*3*2*1=120
		int No=5; int fact=1;
//		
//		for(int i=1;i<=5;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("The Factorial "+No+" is "+fact);
//		
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial "+No+" is "+fact);
	}	
}
