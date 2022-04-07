package logical_programme;

public class Character_count {

	public static void main(String[] args) {
      
//		String S="aabbaaaaaaaaaaa";
//		
//		int total_count=S.length(); // Total Count
//		
//		int Total_countWithout_a=S.replace("a","").length();// Total length after Removing
//		
//		int count=total_count-Total_countWithout_a;
//		
	//	System.out.println("No of occurences a is "+count);
		
	
	
	String A="madam";
	
	int Totalcount = A.length();
	int TotalCount_Witout_a=A.replace("a", "").length();
	
	int count=Totalcount-TotalCount_Witout_a;
	System.out.println("No of occurences a is "+count);
	
	
	}
}
