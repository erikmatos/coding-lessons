package ca.ematos.aws;

import java.util.ArrayList;
import java.util.List;

public class Distance {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(3000);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(4000);
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(5000);
		
		List<List<Integer>> locations = new ArrayList<List<Integer>>();
		locations.add(a);
		locations.add(b);
		locations.add(c);
		
		FlightBackCalculator(locations, 7000).stream().forEach(System.out::println);
	}

	public static List<List<Integer>> FlightBackCalculator(List<List<Integer>> allDistances, int maxDistance){
		
		
		//allDistances.stream().anyMatch(f -> f.stream().collect(Collectors.summingInt(i -> c)))
		
		
		return allDistances;
	}
}
