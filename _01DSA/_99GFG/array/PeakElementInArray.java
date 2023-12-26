package _01DSA._99GFG.array;

/*
Problem Statement
	User Experience
	Business Requirement
Functional Requirement
Non-Functional Requirement
Scale Estimation
	request/minutes at peak time
Db design
	table & relationship
	Primary key & foreign key
	Index
HLD diagram
	




Print of element of array- O(n)
for(i=1;i<=n;i*=2){print(a[i])}  -O(logn)
for(i=1;i<n;i++)
	for(j=1;i<m;j++) {O(n*m)}  n(m+1)/2=>n*m/2+n/2=>n*m/2=>n*m
int a=0,i=N; while(i>0){a+=i; i/=2;}  O(logn)
for(i=n/2;i<=n;i++) for(j=2;j<=n;j=j*2){k=k+n/2;}  nlog(n)


1 8 6 2 5 4 8 3 7

*/
public class PeakElementInArray {
	public static void main(String[] args) {
		//m1();
		m2();
	}

	private static void m2() {
		int[] arr = { 2, 1, 4, 3, 6, 8, 10, 7, 9 };

		
	}

	private static void m1() {
		int[] arr = { 2, 1, 4, 3, 6, 8, 10, 7, 9 };
		int i = 0;
		int j = arr.length - 1;
		int peak = arr[0];
		for (; i < arr.length - 1 && j >= 0 && i < j;) {
			if (arr[i] < arr[j]) {
				if (arr[i] > arr[i + 1]) {
					i++;
				} else if (arr[j] < arr[j - 1]) {

				}
			} else {
				break;// return -1
			}
		}
		System.out.println(peak);
	}
}
