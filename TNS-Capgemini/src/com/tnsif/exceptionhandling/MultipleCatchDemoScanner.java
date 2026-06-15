package com.tnsif.exceptionhandling;

//Multiple Catch blocks
import java.util.Scanner;

public class MultipleCatchDemoScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter first number: ");
			int a = sc.nextInt();

			System.out.print("Enter second number: ");
			int b = sc.nextInt();

			System.out.print("Enter array index: ");
			int index = sc.nextInt();

			int arr[] = new int[5];

			System.out.println("Division Result = " + (a / b));
			System.out.println("Array Element = " + arr[index]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurred");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds Exception Occurred");
		} catch (Exception e) {
			System.out.println("Some Other Exception Occurred");
		}

		sc.close();
	}
}
