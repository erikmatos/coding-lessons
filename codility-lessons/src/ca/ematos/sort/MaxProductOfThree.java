package ca.ematos.sort;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		int[] A = {-3, 1, 2, -2, 5, 6};
		System.out.println(solution(A));
		
		int[] B = {-5, 5, -5, 4};
		System.out.println(solution(B));
		
		int[] C = {10, 10, 10};
		System.out.println(solution(C));
		
		int[] D = {4, 5, 1, 0};
		System.out.println(solution(D));
	}
	
	//O(N * log(N))
	public static int solution(int[] A) {
		int n = A.length;
		int result = 0;
        if (n >= 3)
        {
    		int firsts = 0, lasts = 0;
            Arrays.sort(A);

            lasts = A[n - 1] * A[n - 2] * A[n - 3];
            firsts = A[0] * A[1] * A[n - 1];
            if (firsts > lasts)
                result = firsts;
            else
                result = lasts;
        }

        return result;
    }

}
