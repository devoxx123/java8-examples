package com.java8.converter;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToMapToSet {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
		System.out.println("Convert List To Map : " + productPriceMap);

		// Converting Product List into a Set
		Set<Float> productPriceSet = productsList.stream().filter(product -> product.getPrice() < 30000)
				.map(product -> product.getPrice()).collect(Collectors.toSet());
		System.out.println("Convert List To Set : " + productPriceSet);

		// Filtering and Iterating Collection
		productsList.stream().filter(product -> product.getPrice() == 30000)
				.forEach(product -> System.out.println(product.getPrice()));

		// Find Maximum And Minimum Methods
		// max() method to get max Product price
		Product maxPrice = productsList.stream()
				.max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
		System.out.println("Maximum Product Price : " + maxPrice.getPrice());
		/* ((((OR)))) */
		double priceMax = productsList.stream().mapToDouble(Product::getPrice).max().getAsDouble();
		System.out.println("MaxProduct Price  : " + priceMax);

		// min() method to get min Product price
		Product minPrice = productsList.stream()
				.max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
		System.out.println("Minimum Product Price : " + minPrice.getPrice());
		/* ((((OR)))) */
		double productMin = productsList.stream().mapToDouble(Product::getPrice).min().getAsDouble();
		System.out.println("Min Product Price : " + productMin);

		// Using Collectors's method to sum the prices.
		double totalProductPrice = productsList.stream().collect(Collectors.summingDouble(Product::getPrice));
		System.out.println("Total Product Price : " + totalProductPrice);
		
		DoubleSummaryStatistics priceStatistcs=productsList.stream().mapToDouble(Product::getPrice).summaryStatistics();
		System.out.println("Price Statistics :" + priceStatistcs);

	}

}
