package logical_programme;

public class Armstrong_No {

	public static void main(String[] args) {

//		
//		int a=153;
//		int rem=0;  
//		int temp=a;
//		int armno=0;
//		while(a!=0) {
//			
//			rem=a%10;//1
//			armno=armno+rem*rem*rem;
//			a=a/10;
//		}
//		
//		if(armno==temp) {
//		System.out.println(" armstrong no  "+temp);
//		}
//	 else {
//	System.out.println("not armstrong no");
//	}

       int n=153; //1^3*5^3*3^3
       int c=n;
       int rem=0;
       int armno=0;
       
       while(n>0)//(153>0) (15>0) (1>0)
       {
    	   rem=n%10; // 3,5,0.1
    	   armno=armno+rem*rem*rem;//27+152+1=153
    	   n=n/10;// 15;15/10;
       }
       if(armno==c)
       {System.out.println("this is the armstrong no"+c);}
       else {
    	   System.out.println("not armstrong no");
       }
}
}