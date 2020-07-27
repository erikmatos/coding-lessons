package ca.ematos.codility.primes;

public class Flags {

	/*
	 * A non-empty array A consisting of N integers is given.
	 * 
	 * A peak is an array element which is larger than its neighbors. More precisely, it is an index P such 
	 * that 0 < P < N − 1 and A[P − 1] < A[P] > A[P + 1].
	 * 
	 * For example, the following array A:
	 * 
	 *     A[00] = 1
	 *     A[01] = 5
	 *     A[02] = 3
	 *     A[03] = 4
	 *     A[04] = 3
	 *     A[05] = 4
	 *     A[06] = 1
	 *     A[07] = 2
	 *     A[08] = 3
	 *     A[09] = 4
	 *     A[10] = 6
	 *     A[11] = 2
	 * has exactly four peaks: elements 1, 3, 5 and 10.
	 * 
	 * You are going on a trip to a range of mountains whose relative heights are represented by array A, as shown in a figure below. 
	 * You have to choose how many flags you should take with you. The goal is to set the maximum number of flags on the peaks, according to certain rules.
	 * 
	 * 
	 * 
	 * Flags can only be set on peaks. What's more, if you take K flags, then the distance between any two flags should be greater than or equal to K. 
	 * The distance between indices P and Q is the absolute value |P − Q|.
	 * 
	 * For example, given the mountain range represented by array A, above, with N = 12, if you take:
	 * 
	 * two flags, you can set them on peaks 1 and 5;
	 * three flags, you can set them on peaks 1, 5 and 10;
	 * four flags, you can set only three flags, on peaks 1, 5 and 10.
	 * You can therefore set a maximum of three flags in this case.
	 * 
	 * Write a function:
	 * 
	 * class Solution { public int solution(int[] A); }
	 * 
	 * that, given a non-empty array A of N integers, returns the maximum number of flags that can be set on the peaks of the array.
	 * 
	 * For example, the following array A:
	 * 
	 *     A[00] = 1
	 *     A[01] = 5
	 *     A[02] = 3
	 *     A[03] = 4
	 *     A[04] = 3
	 *     A[05] = 4
	 *     A[06] = 1
	 *     A[07] = 2
	 *     A[08] = 3
	 *     A[09] = 4
	 *     A[10] = 6
	 *     A[11] = 2
	 * the function should return 3, as explained above.
	 * 
	 * Write an efficient algorithm for the following assumptions:
	 * 
	 * N is an integer within the range [1..400,000];
	 * each element of array A is an integer within the range [0..1,000,000,000].
	 */
	public static void main(String[] args) {

		int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
		
		System.out.println(String.format("Expected [%s] Result [%s]", 3, solution(A)));
		
		int[] B = {0, 0, 0, 0, 0, 1, 0, 1, 0, 1};
		
		System.out.println(String.format("Expected [%s] Result [%s]", 2, solution(B)));
		
	}
	
	//O(N)
	public static int solution(int[] A) {
		
		int n = A.length;
		
		if (n < 3 ) {
			return 0;
		}
		
		int peaks = 0;
		int firstPeakPosition = -1;
		int[] entries = new int[n];

		for(int i = n-2; i > 0; i--) {
			if (A[i-1] < A[i] && A[i] > A[i+1]) {
				entries[i] = i;
				peaks++;
				firstPeakPosition = i;
			} else {
				entries[i] = entries[i+1];
			}
		}
		
		if (peaks < 2) {
			return peaks;
		}

		int flags = 1;
		int k = (int) Math.sqrt(n);
		for (int i = k+1; i > 1; i-- ) {
			int flagsUsed = 1;
			int flagsHave = i-1; 
	        int pos = firstPeakPosition;
	        while (flagsHave > 0) {
	            
	        	if (pos + i >= n-1) {
	                break;
	            }
	        	
	            pos = entries[pos+i];
	            if (pos == 0) {
	                break;
	            }
                
	            flagsUsed += 1;
	            flagsHave -= 1;
	        }
	        
			flags = Math.max(flags, flagsUsed);
		}
		
		return flags;
	}
}
