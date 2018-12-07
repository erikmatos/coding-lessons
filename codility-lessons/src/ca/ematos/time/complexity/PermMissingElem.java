package ca.ematos.time.complexity;

import java.util.Arrays;

public class PermMissingElem {
	/*
	 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
	 * 
	 * Your goal is to find that missing element.
	 * 
	 * Write a function:
	 * 
	 * class Solution { public int solution(int[] A); }
	 * 
	 * that, given an array A, returns the value of the missing element.
	 * 
	 * For example, given array A such that:
	 * 
	 *   A[0] = 2
	 *   A[1] = 3
	 *   A[2] = 1
	 *   A[3] = 5
	 * the function should return 4, as it is the missing element.
	 * 
	 * Write an efficient algorithm for the following assumptions:
	 * 
	 * N is an integer within the range [0..100,000];
	 * the elements of A are all distinct;
	 * each element of array A is an integer within the range [1..(N + 1)].
	 * 
	 * */
	public static void main(String[] args) {
		int[] A = {2, 3, 1, 5};
		System.out.println(String.format("Expected [4] Result [%s]", solution(A)));
		
		int[] B = {2, 3, 1, 5, 4, 8, 9, 7};
		System.out.println(String.format("Expected [6] Result [%s]", solution(B)));
		
		int[] C = {};
		System.out.println(String.format("Expected [1] Result [%s]", solution(C)));
		
		int[] D = {1};
		System.out.println(String.format("Expected [2] Result [%s]", solution(D)));
		
		int[] E = {1,2};
		System.out.println(String.format("Expected [3] Result [%s]", solution(E)));
		
	}
	
	//O(N) or O(N * log(N))
	public static int _solution(int[] A) {
		
		long n = A.length + 1;
		
		long should = (n * ( n + 1 )) / 2;
		
		long current = Arrays.stream(A).sum();
		
		long missing = should - current;
		
		return (int) missing;
	}
	
	//O(N) or O(N * log(N))
	public static int solution(int[] A) {
		
		long missing = A.length + 1;
		
		for(int i = 0; i < A.length; i++) {
			missing = missing ^ A[i] ^ (i+1);
		}
		
		return (int) missing;
	}
	
	
}
