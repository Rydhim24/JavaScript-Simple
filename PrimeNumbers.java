package javaMethodsnFns;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		System.out.println(isPrime(num));
		

	}
	static boolean isPrime(int num) {
		if(num<=1) {
		return false;
		}
		if(num==2 || num==3) {
			return true;
		}
		else if(num%2==0 && num%3==0) {
			return false;
		}
		int i=5;
		while(i*i<=num) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
			
		}
		return true;
	}

}
