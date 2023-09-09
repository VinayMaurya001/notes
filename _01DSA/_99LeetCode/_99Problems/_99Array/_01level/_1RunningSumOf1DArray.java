package _01DSA._99LeetCode._99Problems._99Array._01level;

import java.util.Arrays;

public class _1RunningSumOf1DArray {

	public static void main(String[] args) {
		// m1();
		m2();
	}

	private static void m2() {
		int n=11;
		int noOfSteps=0;
		while(n>0) {
			if(n%2==0) {
				n /= 2;
			}else {
				n -=1;
			}
			noOfSteps++;
		}
	}

	private static int[] m1() {
		int[] nums = { 1, 2, 3, 4 };

		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
