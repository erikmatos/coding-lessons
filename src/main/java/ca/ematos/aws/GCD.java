package ca.ematos.aws;

public class GCD {

	public static void main(String[] args) {
		
		GCD gcd = new GCD();
		
		int[] a = {2,3,4,5,6};
		
		System.out.println(gcd.generalizesGCD(a.length, a));
		
		int[] b = {2,4,6,8,10};
		
		System.out.println(gcd.generalizesGCD(b.length, b));
	}	
	
	public int generalizesGCD(int num, int[] arr) {
		
		int rest = arr[0];
		for(int i = 1; i < num; i++) {
			rest = calculate(arr[i], rest);
		}
		
		return rest;
	}
	
	private int calculate(int a, int b) {
		
		if (a == 0) {
			return b;
		}
		
		return calculate(b % a, a);
	}
}
