package com.tnsif.stringpgms;

public class EqualOperator {
	public static void main(String[] args) {
		String s1 = "meghana";
		String s2 = "meghana";
		String s3 = new String("meghana");
		String s4 = "alice";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);

	}
}
