package ca.ematos.aws;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Distance {

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();
		List<List<Integer>> items = new ArrayList<List<Integer>>();
		
		List<Integer> item = null;
		for(int i = 0; i < 10000000; i++) {
			
			if ( i % 50 == 0) {
				items.add(null);
			}
			
			int random = (int) (Math.random() * 5000 + 1);
			
			item = new ArrayList<>();
			item.add(random);
			
			items.add(item);
		}
		
		FlightBackCalculator(items, 700);
		
		long end = System.currentTimeMillis();
		
		System.out.println(String.format("%d", end-begin));
		
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
				.parallelStream()
				.filter(Objects::nonNull)
				.map(y-> y.parallelStream().filter(Objects::nonNull).filter(d-> d*2<=maxDistance && d > 0).collect(Collectors.toList()))
				.filter(y -> !y.isEmpty())
				.collect(Collectors.toList());
		
		
		
		
		return allDistances;
	}
}
