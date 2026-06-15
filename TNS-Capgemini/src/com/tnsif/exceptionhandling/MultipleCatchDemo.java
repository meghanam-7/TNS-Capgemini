package com.tnsif.exceptionhandling;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;

			int arr[] = new int[5];

			System.out.println(a / b);
			System.out.println(arr[10]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurred");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds Exception Occurred");
		} catch (Exception e) {
			System.out.println("Some Other Exception Occurred");
		}
	}
}