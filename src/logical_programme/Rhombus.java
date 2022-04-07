package logical_programme;

public class Rhombus {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) /// loop for rows
		{
			for(int j=5;j>i;j--)//loop for space
			      { 
				     System.out.print(" ");
			      }
				for(int k=1;k<=(2*i-1);k++)// loop for star *
				  {
					System.out.print("*");
				  }
				   System.out.println();
			}
		////upper part increment the star
///// below part is for decrement the star 		
for(int i=4;i>=1;i--)/// loop for rows
{
	for(int j=5;j>i;j--)//loop for space
	      { 
		     System.out.print(" ");
	      }
		for(int k=1;k<=(2*i-1);k++)// loop for star *
		  {
			System.out.print("*");
		  }
		   System.out.println();
  }
		
	}

}
