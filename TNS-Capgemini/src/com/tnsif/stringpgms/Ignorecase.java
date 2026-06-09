package com.tnsif.stringpgms;

public class Ignorecase {
	public static void main(String[] args) {
		String s1 = "meg";
		String s2 = "MEG";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
	}
}
