package print_Hello;

public class Print_Hello {

	public static void main(String[] args) {

		// Print (Hello) when number is divisible by 3
		
		int a=36;
		int b;
		b=a%3;
		if(b==0)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Not divisible by 3");
		}
	// Print (World) when number is divisible by 6
		int c;
		c=a%6;
		if(c==0)
		{
			System.out.println("World");
		}
		else
		{
			System.out.println("Not divisible by 6");
	
		}
	// Print ( Hello) when divisible by   all 3,6 and 9
		
		int n=36;
		
		int x=n%3; int y=n%6; int z=n%9;
		
		if(x==0 & y==0 & z==0)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println(" Not divisible by 3,6 and 9");
		}
	
	}
	

}
