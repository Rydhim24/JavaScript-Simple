package Test;

import java.util.Scanner;

public class AddOfNum {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		if(c>30) {
			System.out.println(c);
		}
		else {
			System.out.println("restart");
			AddOfNum.main(args);
			
		}
		
	}
	
//static methods can be called with class name.
}
