package com.tnsif.lambdaexpression;

@FunctionalInterface
interface Cube {
	int calc(int a);
}

public class AdditionMain {
	public static void main(String[] args) {
		Cube c = (a) -> {
			return (a * a * a);
		};
		System.out.println("Cube of a number: " + c.calc(3));
	}
}
