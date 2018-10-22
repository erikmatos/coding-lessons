package ca.ematos.aws;

import java.util.Arrays;

public class Evaluation {

	public static void main(String[] args) {

		
		int[] numbers = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		
		Arrays.sort(numbers);
		
		int pos = 0;
		int number = numbers[pos];
		
		while ( number < 0 && pos < numbers.length) {
			pos++;
			number = numbers[pos];
		}

		int neg = 1;
		int aux = 0;
		
		while( pos < numbers.length && neg < pos && numbers[neg] < 0) {
			
			aux = numbers[neg];
			numbers[neg] = numbers[pos];
			numbers[pos] = aux;
            pos++;
            neg += 2;
		}
	}

}
