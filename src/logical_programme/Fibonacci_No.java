package logical_programme;

public class Fibonacci_No {

	public static void main(String[] args) {
  // fibonacci No = 0+1+1+2+3+5+8+13+21+34
		int FN=0,SN=1,TN;
	
		for(int i=1;i<=10;i++)
		{
			TN=FN+SN;
			System.out.print(TN+",");
			FN=SN;
			SN=TN;
		}
				
		
	}

}
