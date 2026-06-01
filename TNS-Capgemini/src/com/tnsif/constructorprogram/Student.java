package com.tnsif.constructorprogram;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("id: " + id);
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		Student s = new Student(101, "Meg");
		Student s1 = new Student(102, "gem");

		s.display();
		s1.display();
	}
}
