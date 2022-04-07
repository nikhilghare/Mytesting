package logical_programme;

public class Duplicate_No {

	public static void main(String[] args) {

		// Duplicate No works on the principle of the two same No i.e. i and j
		
		int ar[]= {2,3,5,4,3,7,9}; // In that the duplicate no is 3 // We Can Give int[] NO PROBLEM
		boolean flag=false;
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
		        if(ar[i]==ar[j])
		        		{
		        	       System.out.println("The Duplicate No is "+ar[i]); // or We can Write ar[j]
		        	       flag=true;
		        		}
			}
		}
		if (flag==false)
		{
			System.out.println("Duplicate Element Not Found");
		}
	}
	
}
