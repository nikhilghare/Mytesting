package logical_programme;

public class Kth_Highest_Number {

	public static void main(String[] args) {

		// In that we have find out the 2nd,3rd,4th & Nth Number
		// in that we use the i & j 
		
		int ar[]= {5,8,12,7,6,2,4};
		int temp;
		int k=4;
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]<ar[j])//12,8,7,5
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			if(i==k-1) //i=0 & takes index value
			{
				System.out.println(k+"The  highest Number is "+ar[i]);
				break;
			}
		}
	
	}

}
