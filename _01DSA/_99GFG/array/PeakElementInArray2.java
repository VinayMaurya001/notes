package _01DSA._99GFG.array;

import java.util.HashMap;
import java.util.Map;
//https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?page=2&sortBy=submissions
public class PeakElementInArray2 {
	public static void main(String[] args) {
		// m1();
		// m2();
//		m3();
		m4();
	}

	private static void m4() {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		boolean found = false;
		if(arr[0]==target) {
			found=true;
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (!found && target != arr[i - 1] && target == arr[i] && target == arr[i + 1]) {
				System.out.println(i);
				found=true;
			}
			if (found && target == arr[i] && target != arr[i + 1]) {
				System.out.println(i);
			}
		}
	}

	private static void m3() {
		int[] arr = { -1, 0, 1, 2, -1, -4 }; // -1,0,1 : -1,2,-1 sum=0
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean result = m2(arr, sum - arr[i], i);
			if (result)
				System.out.println(i + "=" + arr[i]);
		}
	}

	private static boolean m2(int[] arr, int sum, int a) {
		// .a. sum = 6;
		boolean result = false;
		Map map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (a != i) {
				Integer num = sum - arr[i];
				if (map.get(num) != null) {
					Integer index = (Integer) map.get(num);
					System.out.print(index + "=" + arr[index] + " " + i + "=" + arr[i] + " ");
					result = true;
					break;
				} else {
					map.put(arr[i], i);
				}
			}
		}
		return result;

	}

}