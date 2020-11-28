package com.org;

import java.util.List;

public class TestLaptopSelectionss {
	public static void main(String args[])
	{
		List<Laptops> laptops = Laptops.fetchLaptops();
		System.out.println("sequential stream");
		laptops.stream().filter(item->item.getRatings()>4.3).forEach(item->System.out.println(item));
	System.out.println("parallel Stream");
	laptops.parallelStream().filter(item->item.getRatings()>4.3).forEach(item->System.out.println(item));
	

}

}