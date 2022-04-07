package special_Programme;

public class RemoveDulicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     {
	 		String str="java programming language";
	 		System.out.println("old string is :"  +str);
	 		System.out.println("New string is :"+removedupchar(str));
	 	       }	
	 		public static String removedupchar(String str)
	 		{
	 	      String newstr="";
	 		    for(int i=0;i<str.length();i++)
	 		     {
	 			       char ch=str.charAt(i);
	 			       if(newstr.indexOf(ch)==-1) 
	 			          {
	 				        newstr+=ch;
	 			          }
	 		     }
	 		            return newstr;        

	}

}
