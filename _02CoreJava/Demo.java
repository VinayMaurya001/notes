package _02CoreJava;

public class Demo {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 1, 5, 5, 4 };// 6,5,5,4

		
		boolean isLeader = true;
		int leader=arr[0];
		int max=arr[arr.length];
		for (int i = arr.length-1; i >0 ; i--) {
			isLeader = true;
			
			if(arr[i-1]<arr[i]) {
				leader=arr[i];
			}else {
				
			}
			
			
			
		}
	}

	private static void m1() {
		int[] arr = { 2, 6, 1, 5, 5, 4 };// 6,5,5,4

		boolean isLeader = true;
		for (int i = 0; i < arr.length; i++) {
			isLeader = true;
			int j = i+1;
			for (; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					isLeader = false;
					break;
				}
			}
			if (j == arr.length) {
				System.out.println(arr[i]);
			}
		}
	}

}
