package ca.ematos.sums;

public class CountDiv {

	public static void main(String[] arguments) {

		System.out.println(solution(6, 11, 2));
		
		System.out.println(solution(11, 6, 2));
		
		System.out.println(solution(0, 2000000, 1));
		
		System.out.println(solution(101, 123450000, 10000));
		
		System.out.println(solution(1, 1, 11));
		
		System.out.println(solution(0, 0, 11));
	}
	
	public static int solution(int A, int B, int K) {

		int counter = 1;
		
		if ( A >= 0 && A <= B && K > 0) {
			int first = A / K;
			int second = B / K;

			counter = (second - first);
			if (A % K == 0) counter++;
			
		}
		
		return counter;
	}

}
