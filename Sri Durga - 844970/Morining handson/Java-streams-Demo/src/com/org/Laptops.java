package com.org;

import java.util.ArrayList;
import java.util.List;

public class Laptops {
	private String brandName;
	private double ratings;
	private double price;
	private String ramSize;
	public Laptops(String brandName, double ratings, double price, String ramSize) {
		super();
		this.brandName = brandName;
		this.ratings = ratings;
		this.price = price;
		this.ramSize = ramSize;
	}
	public Laptops() {
		super();
	}
	public static List<Laptops> fetchLaptops() {
		List<Laptops> laptops = new ArrayList<Laptops>();
		laptops.add(new Laptops("HP", 4.2, 60000, "16GB"));
		laptops.add(new Laptops("Acer", 4.1, 55000, "16GB"));
		laptops.add(new Laptops("Dell", 4.3, 65000, "16GB"));
		laptops.add(new Laptops("Lenova", 4.0, 50000, "8GB"));
		laptops.add(new Laptops("HP", 4.5, 65000, "16GB"));
		laptops.add(new Laptops("Acer", 4.3, 60000, "16GB"));
		laptops.add(new Laptops("Dell", 3.9, 30000, "4GB"));
		laptops.add(new Laptops("Lenova", 3.5, 25000, "4GB"));
		laptops.add(new Laptops("HP", 4.8, 80000, "32GB"));
		laptops.add(new Laptops("Acer", 4.6, 63000, "32GB"));
		laptops.add(new Laptops("Dell", 4.4, 50000, "8GB"));
		laptops.add(new Laptops("Lenova", 4.3, 75000, "16GB"));
		return laptops;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", ratings=" + ratings + ", price=" + price + ", ramSize=" + ramSize
				+ "]";
	}
	
	
}
