package logical_programme;

public class Reverse_String {

	public static void main(String[] args) {
   
	// REVERSE STRING BY CHARACTER
		String S ="VELOCITY";// length=8; index=7
		 
		System.out.println("This is the original String "+S);
		
		for(int i=S.length()-1;i>=0;i--)  // whnever only one sprint use length()
		{
			System.out.print(S.charAt(i));  //yti
		//	System.out.println(S.charAt(i));  //DONT USE println
		}
		
		// REVERSE STRING BY WORDS
		String N= "LIFE IS BEAUTIFUL ENJOY IT";
		String seperator =" ";
		
		String[] output=N.split(seperator);
		
		for(int i=output.length-1;i>=0;i--)
		{
			System.out.print(output[i]+" ");
		}
		//System.out.println("");
		
		for(int i=0;i<=output.length-1;i++)
		{
			System.out.println(output[i]+" ");
		}
		
	}

	}


