package com.tnsif.scannerclassprogram;

import java.util.Scanner;

public class Personexec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter person name");
		String name = sc.nextLine();
		System.out.println("enter income");
		int income = sc.nextInt();

		Person pp = new Person();
		pp.setName(name);
		pp.setIncome(income);

		TaxCalculation t = new TaxCalculation();
		t.calctax(pp);

		System.out.println("after tax calculation");
		System.out.println(pp);
	}

}
