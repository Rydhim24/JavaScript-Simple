package javaMethodsnFns;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		change(arr);
		System.out.println(Arrays.toString(arr));

}
	static void change( int[] nums) {
		nums[0]=99;
	}
}