package com.tnsif.streamAPIpgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutStreamAPI {
	public static void main(String[] args) {
		// org list of number
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(numbers);

		// List to hold the result
		List<Integer> result = new ArrayList<>();

		// iterate over each num in org list
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				int doubled = number * 2;
				result.add(doubled);

			}
		}
		System.out.println("doubled even number: " + result);
	}
}
