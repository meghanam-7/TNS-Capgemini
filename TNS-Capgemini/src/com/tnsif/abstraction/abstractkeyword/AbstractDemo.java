package com.tnsif.abstraction.abstractkeyword;

//main class where we run the prgm
public class AbstractDemo {
	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle r = new Rectangle();

		System.out.println("Square");
		sq.calcarea();
		sq.show();

		System.out.println("Rectangle");
		r.calcarea();
		r.show();
	}
}
