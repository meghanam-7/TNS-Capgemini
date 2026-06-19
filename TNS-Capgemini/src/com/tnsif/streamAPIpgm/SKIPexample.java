package com.tnsif.streamAPIpgm;

import java.util.stream.Stream;

public class SKIPexample {
public static void main(String[] args) {
	Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 17, 18).filter(num -> num % 2 == 0).skip(5)
			.forEach(num -> System.out.println(num + " "));
}
}
