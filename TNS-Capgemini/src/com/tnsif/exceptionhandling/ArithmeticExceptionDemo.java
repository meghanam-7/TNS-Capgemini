package com.tnsif.exceptionhandling;

public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
		int c = 50;
		int d = 10;
		int res = c / d;
		System.out.println("result: " + res);

		/*
		 * for statements which Arithmetic exception can occur, put them in a try catch
		 * block to get them executed
		 */
		try {
			int a = 10;
			int b = 0;

			int result = a / b;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurred");
		}
	}

}
