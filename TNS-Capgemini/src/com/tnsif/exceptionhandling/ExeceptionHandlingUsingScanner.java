package com.tnsif.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeceptionHandlingUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("result: " + a / b);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}

		sc.close();
	}
}
