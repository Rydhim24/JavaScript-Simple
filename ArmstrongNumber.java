package javaMethodsnFns;

import java.util.Scanner;

public class ArmstrongNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		System.out.println(isArmstrong(num));

	}
	static boolean isArmstrong(int num) {
		int sum=0;
		int temp=num;
		while(temp>0) {
			int rem=temp%10;
			int cube=rem*rem*rem;
			sum+=cube;
			temp/=10;
		}
		return num==sum;
	}

}
