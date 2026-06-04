package com.tnsif.abstraction.abstractkeyword;

//pgm to demostrate abstraction

public class Square extends Shape {
	private float side;

	public Square() {
		side = 4.0f;
	}

	@Override
	void calcarea() {
		area = side * side;
	}
}
