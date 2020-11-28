package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestProductSelection {

	public static void main(String[] args) {
		// Suppose user wants only Lenova, but ratings should be in sorted order
		List<Laptops> laptops = Laptops.fetchLaptops();
		// get only particular laptop and add to the collection
		List<Laptops> particularLaptops = new ArrayList<Laptops>();
		for(Laptops laptop : laptops) {
			if(laptop.getBrandName().equals("Lenova"))
				particularLaptops.add(laptop);
		}
		// sort the particular laptop with ratings in sorted order
		Collections.sort(particularLaptops, new Comparator<Laptops>() {
			@Override
			public int compare(Laptops o1, Laptops o2) {
				return Double.compare(o2.getRatings(), o1.getRatings());
			}
		});
		// iterate the sorted laptops
		for(Laptops laptop : particularLaptops) {
			System.out.println(laptop);
		}
	}

}
