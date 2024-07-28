package Conditional;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Operator:");
		char op = scanner.next().trim().charAt(0);
		int ans=0;
		
		while(true) {
			if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
				System.out.println("Enter Number:");
				int a=scanner.nextInt();
				int b=scanner.nextInt();
				if(op=='+') {
					ans=a+b;
				}
				else if(op=='-') {
					ans=a-b;
				}
				else if(op=='*') {
					ans=a*b;
				}
				else if(op=='/') {
					if(b!=0) {
						ans=a+b;
					}
				}
				else if(op=='%') {
					if(b!=0) {
						ans=a%b;
					}
				}System.out.println("Result "+ans);
		}
}
	}
}
	
			
		
			
		



