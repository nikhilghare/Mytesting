package logical_programme;

import java.util.Scanner;

public class Lcm_Hcf {

	public static void main(String[] args) {

//		int a,b,t,x,y,gcd,lcm;
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enters the two value\n");
//		
//		x=sc.nextInt();
//		y=sc.nextInt();
//		
//		a=x;
//		b=y;
//		
//		while(b!=0)
//		{
//			t=b;
//			b=a%b;
//			a=t;
//		}
//		gcd=a;
//		
//		lcm=(x*y)/gcd;
//		
//		System.out.println("the highest common factor is "+x+"and"+y+"is "+gcd);
//		System.out.println("The least common factor is "+x+"and"+y+"is "+lcm);
		
		 int hcf=0, lcm=0, c;
	     Scanner s=new Scanner(System.in); 
	     System.out.println("ENTER TWO NO.====>:");
	     int a= s.nextInt();  //int a=12;//int b=18;
	     int b= s.nextInt();
	     c= Math.min(a,b);
	     for(int i=1;i<=c;i++)
	     {
	    	 if(a%i==0 && b%i==0)
	    		 hcf=i;
	     }
	     
	    lcm=(a*b)/hcf;
	    System.out.println("HCF OF NO. IS====>:"+hcf);
	    System.out.println("LCM OF NO. IS====>:"+lcm);
		
	}

}
