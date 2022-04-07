package logical_programme;

public class Largest_Number {

	public static void main(String[] args) {

		//Find the Largest Number from Array
		// Swapping concept used 
		
		int ar[]= {3,5,8,4,9,2,6};
		
		int Max=ar[0];
		
		for(int i=1;i<=ar.length-1;i++)
		{
			if(ar[i]>Max)
			{
				Max=ar[i];
			}
		}
		System.out.println("The highest No is "+Max);
		
		// SMALLEST NUMBER FROM ARRAY
		
		int ar1[]= {2,8,7,6,4,3,1};
		
		int min=ar1[0];
		
		for(int i=1;i<=ar1.length-1;i++)
		{
			if(ar1[i]<min)
			{
				min=ar1[i];
			}
		}
		System.out.println("The smallest no in array is "+min);
		
		
	}

}
