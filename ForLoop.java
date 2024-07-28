package Conditional;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
//		if(a>b && a>c) {
//			System.out.println("a is greatest");
//		}
//		else if(b>a && b>c){
//			System.out.println("b is greatest");
//		}
//		else {
//			System.out.println("c is greatest");
//		}
		int max=Math.max(c,Math.max(a, b));
		System.out.println(max);

	}

}
