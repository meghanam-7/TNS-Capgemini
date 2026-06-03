package com.tnsif.finalpgms;

class Father {
	int a = 90;

	void display() {
		System.out.println("welcomejava");
	}
}

public class FinalMethod {
	// @Override //we cannot override
	final void display() {
		System.out.println("python");
	}
}
