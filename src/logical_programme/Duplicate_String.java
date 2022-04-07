package logical_programme;

public class Duplicate_String {

	public static void main(String[] args) {
       
		// Find Duplicate String Using Array
		
		String ar[]= {"java","c++","c","python","java"};
		boolean flag=false;
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("The Duplicate String Is "+ar[j]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element Not Found");
		}
		
	}

}
