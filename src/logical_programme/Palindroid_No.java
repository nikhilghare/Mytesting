package logical_programme;

public class Palindroid_No {

	public static void main(String[] args) {
      
		//121,151,535 are the palendroid no
		// its work on the concept of the reverse 
		 int n=121;
		 int temp=n;
		 int rev=0; int rem;
		 
		 while(n>0)//(121>0)(12>0)(1>0)
		 {
			 rem=n%10;  //1,2,1
			 rev=rev*10+rem; //1,12,121
			 n=n/10;//121/10=12,12/10=1;
			 
		 }
		 if (rev==temp)
		 {
			 System.out.println("palendroid no is "+temp);
		 }
		 else {System.out.println("its not palendroid no");}
	}

}
