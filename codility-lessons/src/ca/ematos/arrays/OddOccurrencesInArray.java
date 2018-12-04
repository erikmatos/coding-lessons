package ca.ematos.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {

	/*
	 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, 
	 * and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
	 * 
	 * For example, in array A such that:
	 * 
	 *   A[0] = 9  A[1] = 3  A[2] = 9
	 *   A[3] = 3  A[4] = 9  A[5] = 7
	 *   A[6] = 9
	 * the elements at indexes 0 and 2 have value 9,
	 * the elements at indexes 1 and 3 have value 3,
	 * the elements at indexes 4 and 6 have value 9,
	 * the element at index 5 has value 7 and is unpaired.
	 * Write a function:
	 * 
	 * class Solution { public int solution(int[] A); }
	 * 
	 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
	 * 
	 * For example, given array A such that:
	 * 
  	 *   A[0] = 9  A[1] = 3  A[2] = 9
	 *   A[3] = 3  A[4] = 9  A[5] = 7
	 *   A[6] = 9
	 * the function should return 7, as explained in the example above.
	 * 
	 * Write an efficient algorithm for the following assumptions:
	 * 
	 * N is an odd integer within the range [1..1,000,000];
	 * each element of array A is an integer within the range [1..1,000,000,000];
	 * all but one of the values in A occur an even number of times.
	 */
	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 9, 7, 9};
		System.out.println(String.format("Expected [7] Result [%s]", solution(A)));
		
		int[] B = { 2, 2, 3, 3, 4};
		System.out.println(String.format("Expected [4] Result [%s]", solution(B)));
		
		int[] C = { 42};
		System.out.println(String.format("Expected [42] Result [%s]", solution(C)));
	}

	//O(N) or O(N*log(N))
    public static int _solution(int[] A) {
    	
    	int n = A.length;
    	
    	if(n == 0)  {
    		return 0;
    	}

    	if(n == 1)  {
    		return A[0];
    	}
    	
    	Arrays.sort(A);
    	
    	int counter = 0;
    	int steping = 2;
    	while (counter < n-1) {
    		
    		if (A[counter] != A[counter+1]) {
    			return A[counter];
    		}
    		
    		counter+=steping;
    	}
    	    	
    	return A[n-1];
    }
    
    //O(N) or O(N*log(N))
    public static int solution(int[] A) {
    	
    	int missing = 0;
    	
    	for(int a : A) {
    		missing ^= a;
    	}
    	
    	return missing;
    }

}
