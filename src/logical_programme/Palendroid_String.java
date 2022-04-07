package logical_programme;

public class Palendroid_String {

	public static void main(String[] args) {

		// Palendriod String
		
		String S1="madam";
		String S2="";
		
		for(int i=S1.length()-1;i>=0;i--)  //Its Reverse the String
		{
			S2=S2+S1.charAt(i);            //Reverse The String Store into the S2
		}
		if(S1.equals(S2))                  //Comparing the String
		{
			System.out.println("String is Palendroid String");
		}
		else
		{
			System.out.println("String is not Palendroid String");
		}
		}

}
