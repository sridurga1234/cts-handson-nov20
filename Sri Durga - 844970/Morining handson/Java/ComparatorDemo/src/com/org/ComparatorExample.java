package com.org;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class ComparatorExample {
			public static void main(String[] args) {
	        List<Items> list = new ArrayList<Items>();
	        list.add(new Items(200, "mobile", 10000));
	        list.add(new Items(600, "laptop", 30000));
	        list.add(new Items(900, "tv", 20000));
	        list.add(new Items(100, "computer", 25000));
	        for (Items i : list) {
	            System.out.println(i);
	        }
	        System.out.println("Sorting by name in ascending order");
	        Collections.sort(list, new Comparator<Items>() {
	            public int compare(Items l1, Items l2) {
	                return l1.getName().compareTo(l2.getName());
	            }
	        });
	        for (Items i : list) {
	            System.out.println(i);
	        }
	        System.out.println("Sorting by name in descending order");
	        Collections.sort(list, new Comparator<Items>() {
	            public int compare(Items l1, Items l2) {
	                return l2.getName().compareTo(l1.getName());
	            }
	        });
	        for (Items i : list) {
	            System.out.println(i);
	        }
	        System.out.println("Sorting by price in ascending order");
	        Collections.sort(list, new Comparator<Items>() {
	            public int compare(Items l1, Items l2) {
	                return (int) (l1.getPrice() - (l2.getPrice()));
	            }
	        });
	        for (Items i : list) {
	            System.out.println(i);
	        }
	        System.out.println("Sorting by price in descending order");
	        Collections.sort(list, new Comparator<Items>() {
	            public int compare(Items l1, Items l2) {
	                return (int) (l2.getPrice() - (l1.getPrice()));
	            }
	        });
	        for (Items i : list) {
	            System.out.println(i);
	        }
	        System.out.println("Sorting by id in ascending order");
	        Collections.sort(list, new Comparator<Items>() {
	            public int compare(Items l1, Items l2) {
	                return l1.getId()-(l2.getId());
	            }
	        });
	        for (Items i : list) {
	            System.out.println(i);
	        }
	        System.out.println("Sorting by id in descending order");
	        Collections.sort(list, new Comparator<Items>() {
	            public int compare(Items l1, Items l2) {
	                return l2.getId()-(l1.getId());
	            }
	        });
	        for (Items i : list) {
	            System.out.println(i);
	        }
	        
	    }

	 

	}
	 