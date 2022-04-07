package special_Programme;

public class toUpperCase_toLowerCase {

	public static void main(String[] args) {
 	
		String s="NikhilMarutighare";
		int Lower=0; int Number=0;
		int Upper=0; int special=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			if(ch>65 && ch<=90)
				Upper++;
			else if(ch>= 97 && ch <=122)
				Lower++;
			else if(ch>= 48 && ch<=57)
				Number++;
			else
				special++;
		}
		System.out.println("Upper"+Upper);
		System.out.println("lower"+Lower);
		System.out.println("Number"+Number);
		System.out.println("Special"+special);

		
// By Simple Else if 	
//		  String str = "#GeeKs01fOr@gEEks07";
//	        int upper = 0, lower = 0, number = 0, special = 0;
//	 
//	        for(int i = 0; i < str.length(); i++)
//	        {
//	            char ch = str.charAt(i);
//	            if (ch >= 'A' && ch <= 'Z')
//	                upper++;
//	            else if (ch >= 'a' && ch <= 'z')
//	                lower++;
//	            else if (ch >= '0' && ch <= '9')
//	                number++;
//	            else
//	                special++;
//	        }
//	 
//	        System.out.println("Lower case letters : " + lower);
//	        System.out.println("Upper case letters : " + upper);
//	        System.out.println("Number : " + number);
//	        System.out.println("Special characters : " + special);
//	
	}

}
