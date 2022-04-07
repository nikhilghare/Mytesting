package print_Hello;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Reverse_practise {

	public static void main(String[] args) {
		int No; int fact=1;
	Scanner s= new Scanner(System.in);
	System.out.println("enters fibonacci no10");
	No=s.nextInt();
//		for(int i=1;i<=5;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("The Factorial "+No+" is "+fact);
//		
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial "+No+" is "+fact);		
	
	}}
