package ca.ematos.aws;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Distance {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(3000);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(4000);
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(5000);
		
		List<Integer> d = null;
		
		List<Integer> e = new ArrayList<Integer>();
		e.add(null);
		
		List<List<Integer>> locations = new ArrayList<List<Integer>>();
		locations.add(a);
		locations.add(b);
		locations.add(c);
		locations.add(d);
		locations.add(e);
		
		FlightBackCalculator(locations, 7000).stream().forEach(System.out::println);
	}

	public static List<List<Integer>> FlightBackCalculator(List<List<Integer>> allDistances, int maxDistance){
		
		
		allDistances = allDistances
				.stream()
				.filter(Objects::nonNull)
				.map(y-> y.stream().filter(Objects::nonNull).filter(d-> d*2<=maxDistance).collect(Collectors.toList()))
				.filter(y -> !y.isEmpty())
				.collect(Collectors.toList());
		
		
		
		
		return allDistances;
	}
}
