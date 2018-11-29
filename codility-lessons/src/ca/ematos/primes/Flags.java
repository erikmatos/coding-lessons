package ca.ematos.primes;

import java.util.Stack;
import java.util.Vector;

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
		
		int[] C = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		//System.out.println(String.format("Expected [%s] Result [%s]", 0, solution(C)));
		
	}
	
	public static int solution(int[] A) {
		
		int n = A.length;
		
		if (n < 3 ) {
			return 0;
		}
		
		Stack<Integer> positions = new Stack<Integer>();
		for(int i = 1; i < n -1; i++) {
			if (A[i-1] < A[i] && A[i] > A[i+1]) {
				positions.add(i);
			}
		}
		
		if (positions.size() < 2) {
			return positions.size();
		}
		
		long max_flags = 1;
		
		int max_min_distance = (int) Math.sqrt(n);

		System.out.println(max_min_distance);
		
		
		
		return positions.size();
	}

	/**
	 * long k = Math.abs(n / 3);
		def solution(A):
    from math import sqrt
    A_len = len(A)
    next_peak = [-1] * A_len
    peaks_count = 0
    first_peak = -1
    # Generate the information, where the next peak is.
    for index in xrange(A_len-2, 0, -1):
        if A[index] > A[index+1] and A[index] > A[index-1]:
            next_peak[index] = index
            peaks_count += 1
            first_peak = index
        else:
            next_peak[index] = next_peak[index+1]
    if peaks_count < 2:
        # There is no peak or only one.
        return peaks_count
    max_flags = 1
    max_min_distance = int(sqrt(A_len))
    for min_distance in xrange(max_min_distance + 1, 1, -1):
        # Try for every possible distance.
        flags_used = 1
        flags_have = min_distance-1 # Use one flag at the first peak
        pos = first_peak
        while flags_have > 0:
            if pos + min_distance >= A_len-1:
                # Reach or beyond the end of the array
                break
            pos = next_peak[pos+min_distance]
            if pos == -1:
                # No peak available afterward
                break
            flags_used += 1
            flags_have -= 1
        max_flags = max(max_flags, flags_used)
    return max_flags
	 * */
}
