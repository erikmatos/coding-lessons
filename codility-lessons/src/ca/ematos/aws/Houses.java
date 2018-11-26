package ca.ematos.aws;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Houses {

	public static void main(String[] args) {
		
		int[] states = {1, 0, 0, 0, 0, 1, 0, 0};
		
		//cellComplete(states, 1).stream().forEach(System.out::println);
		
		states = new int[]{1, 1, 1, 0, 1, 1, 1, 1};
		
		cellComplete(states, 2).stream().forEach(System.out::println);
	}

	public static List<Integer> cellComplete(int[] states, int days){
		
		
		while(days > 0) {
			states = complete(states);
			days--;
		}
		
		return Arrays.stream(states).boxed().collect(Collectors.toList());
	}
	
	private static int[] complete(int[] states) {
		
		if (states.length == 0) {
			return states;
		}
		
		int[] process = new int[states.length];
		process[0] = 0 ^ states[1];
		
		for(int i = 1; i < states.length-1; i++) {
			
			process[i] = states[i-1] ^ states[i+1];
		}
		
		process[states.length-1] = states[states.length-2] ^ 0;
		
		return process;
	}
	
}
