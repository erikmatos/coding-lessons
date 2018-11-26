package ca.ematos.aws;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Tracker {

	public static void main(String[] args) {

		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(4);
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(-1);
		
		List<List<Integer>> locations = new ArrayList<List<Integer>>();
		locations.add(a);
		locations.add(b);
		locations.add(c);
		
		ClosestXdestinations(3, locations, 2).stream().forEach(System.out::println);
	}

	public static List<List<Integer>> ClosestXdestinations(int numDestinations, List<List<Integer>> allLocations, int numDeliveries){
		
		if ( numDeliveries <= numDestinations) {
			
			if ( !allLocations.isEmpty() ) {
				
				SortedMap<Double, List<Integer>> results = new TreeMap<Double, List<Integer>>();
				for(List<Integer> locations : allLocations) {
					 
					if ( !locations.isEmpty() && locations.size() == 2) {
						double first = locations.get(0);
						double second = locations.get(1);
						
						results.put(Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2)), locations);
					}					
				}
				int counter = 0;
				allLocations = new ArrayList<List<Integer>>();
				for(List<Integer> locations : results.values()) {
					
					allLocations.add(locations);
					counter++;
					
					if ( counter == numDeliveries) {
						break;
					}
				}
					
				
			}
			
		}
		
		
		return allLocations;
	}
}
