package com.tnsif.streamAPIpgm;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamOperation {
	public static void main(String[] args) {
		List<Product> pl = new ArrayList<Product>();
		pl.add(new Product(1, "HP", 25000f));
		pl.add(new Product(2, "Asus", 65000f));
		pl.add(new Product(3, "dell", 35000f));

//		List<Float> pl2 = pl.stream().filter(p -> p.price > 30000)// filtering the data
//				.map(p -> p.price) // fetching the price
//				.collect(Collectors.toList()); // collecting as a list
//		System.out.println(pl2);

		// sum by using collectors method
		DoubleSummaryStatistics totalprice = pl.stream()
				.collect(Collectors.summarizingDouble(product -> product.price));
		System.out.println(totalprice);

		// count()
		long count = pl.stream().filter(product -> product.price < 30000).count();
		System.out.println("count: " + count);
	}
}
