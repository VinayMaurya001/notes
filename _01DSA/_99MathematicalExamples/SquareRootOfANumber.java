package _01DSA._99MathematicalExamples;

public class SquareRootOfANumber {

	public static void main(String[] args) {

//		System.out.println(squareRoot1(32 * 32 * 32 * 32 * 32 * 32));
		System.out.println(squareRoot2(3));
	}

	public static double squareRoot1(int num) {
		double temp;
		double sqrtroot = num / 2;
		int i = 0;
		do {
			temp = sqrtroot;
			sqrtroot = (temp + (num / temp)) / 2;
			System.out.println("" + (++i) + " " + temp + " " + sqrtroot + " " + (temp - sqrtroot));
		} while ((temp - sqrtroot) != 0);
		System.out.println(sqrtroot);
		return sqrtroot;
	}

	private static double squareRoot2(double number) {
		// iterator variable
		int i = 1;
		while (true) {
			// for perfect square numbers
			if (i * i == number) {
				return i;
			}
			// for not perfect square numbers
			else if (i * i > number) {
				// returns the value calculated by the method decimalSqrt()
				return decimalSqrt(number, i - 1, i, 1);
			}
			// increments the variable i by 1
			i++;
		}
	}

	// recursive method to find the square root of a number up to 7 decimal places
	private static double decimalSqrt(double number, double i, double j, int iteration) {
		System.out.println(iteration + " " + " " + i + " " + j);
		// calculates the middle of i and j
		double midvalue = (i + j) / 2;
		// finds the square of the midvalue
		double square = midvalue * midvalue;
		// compares the midvalue with square up to n decimal places
		if (square == number || Math.abs(square - number) < 0.0000001)
			return midvalue;
		// if the square root belongs to second half
		else if (square > number)
			return decimalSqrt(number, i, midvalue, ++iteration);
		// if the square root belongs to first half
		else
			return decimalSqrt(number, midvalue, j, ++iteration);
	}

}
