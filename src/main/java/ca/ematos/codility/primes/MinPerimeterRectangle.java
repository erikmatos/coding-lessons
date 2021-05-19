package ca.ematos.codility.primes;

public class MinPerimeterRectangle {

	/*
	 * An integer N is given, representing the area of some rectangle.
	 * 
	 * The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).
	 * 
	 * The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.
	 * 
	 * For example, given integer N = 30, rectangles of area 30 are:
	 * 
	 * (1, 30), with a perimeter of 62,
	 * (2, 15), with a perimeter of 34,
	 * (3, 10), with a perimeter of 26,
	 * (5, 6), with a perimeter of 22.
	 * Write a function:
	 * 
	 * class Solution { public int solution(int N); }
	 * 
	 * that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.
	 * 
	 * For example, given an integer N = 30, the function should return 22, as explained above.
	 * 
	 * Write an efficient algorithm for the following assumptions:
	 * 
	 * N is an integer within the range [1..1,000,000,000]
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(String.format("Minimal Perimiter [30] Expected [22] Result[%s]", solution(30)));
		System.out.println(String.format("Minimal Perimiter [1] Expected [4] Result[%s]", solution(1)));
		System.out.println(String.format("Minimal Perimiter [1234] Expected [1238] Result[%s]", solution(1234)));
		System.out.println(String.format("Minimal Perimiter [101] Expected [204] Result[%s]", solution(101)));
		System.out.println(String.format("Minimal Perimiter [982451653] Expected [1964903308] Result[%s]", solution(982451653)));

		
	}

	//O(sqrt(N))
	public static int solution(int N) {
		long perimeter = Integer.MAX_VALUE;
		
		long a = 1l;
		long b = 0l;
		while ( a * a <= N ) {
			b = (N / a);
			
			if ( a * b == N ) {
				perimeter = Math.min(perimeter, 2 * (a + b));				
			}

			a+=1;
		}
		
		return (int) perimeter;
	}
}
