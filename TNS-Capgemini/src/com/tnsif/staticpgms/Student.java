package com.tnsif.staticpgms;

//demo for static method

public class Student {
	int rollno;
	String name;
	static String clg = "IIT";

	// static method change value
	static void change() {
		clg = "IISC";
		// name = "rashmi";
	}

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + clg);
	}

	public static void main(String[] args) {
		Student.change();
		Student s1 = new Student(1, "bob");
		Student s2 = new Student(2, "alice");
		Student s3 = new Student(3, "dora");
		Student s4 = new Student(4, "mechan");

		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}
