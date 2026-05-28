package com.tnsif.encapsulationprogram;

public class Encapsulationdemo {

	int serialnumber;
	String name;
	int age;

	void show() {
		System.out.println(serialnumber + " " + name + " " + age);
	}

	public static void main(String[] args) {
		Encapsulationdemo e = new Encapsulationdemo();
		e.serialnumber = 9;
		e.name = "Doraemon";
		e.age = 6;

		e.show();
	}

}
