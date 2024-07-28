package Conditional;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int ans=0;
		while(num>0) {
			int rem=num%10;
			ans=ans*10+rem;
			num/=10;
		}
		System.out.println(ans);

	}

}
