package com.org;

import java.util.List;
import java.util.stream.Collectors;

public class TestProductSelections {
	
	public static void main(String args[])
	{
		List<Laptops> laptops = Laptops.fetchLaptops();
		List<Laptops> particularlaptops =  laptops.stream()
		.filter(item->item.getBrandName().equals("lenova"))
		.filter(item->item.getPrice()>30000)
		.sorted((l1,l2)->Double.compare(l2.getRatings(),l1.getRatings()))
		.collect(Collectors.toList());
		particularlaptops.forEach(item->System.out.println(item));
	}

}
