package com.tnsif.streamAPIpgm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamAPI {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> result = numbers.stream() // create a stream from the list
				.filter(n -> n % 2 == 0) // Intermediate Process: Keep only even number
				.map(n -> n * 2) // Intermediate Process: fetching(doubled the number)
				.sorted() // Intermediate Process: Sort the numbers
				.collect(Collectors.toList()); // Terminal Process: Collect results
		System.out.println("final doubled numbers: " + result);
	}
}
