package ca.ematos.sums;

public class MinAvgTwoSlice {

	public static void main(String[] args) {

		int[] A = { 4, 2, 2, 5, 1, 5, 8};
		
		System.out.println(solution(A));
		
		int[] B = { -1000, 1000};
		System.out.println(solution(B));
	}

	public static int solution(int[] A) {
        int pos = 0;
        
        if ( A.length >= 2) {
        	float div, calc, avg = Integer.MAX_VALUE;
	        for(int i = 0; i < A.length - 1; i++){
	        	int sum = A[i];
	        	 
	        	for (int j = i+1; j < A.length; j++) {
	        		
	        		sum += A[j];
	        		div = j - i + 1;
	        		calc = sum / div;
	        		
	        		if ( calc < avg ) {
	        			pos = i;
	        			avg = calc;
	        		}
	        		
	        	}
	        }
        }    
        
        return pos;  
	}
}
