package com.tnsif.lambdaexpression;

interface Drawable {
	public void draw();

}

public class WithLambda {
	public static void main(String[] args) {
		int width = 10;
		// with lambda
		Drawable d = () -> {
			System.out.println("Drawing: " + width);
		};
		d.draw();
	}
}
