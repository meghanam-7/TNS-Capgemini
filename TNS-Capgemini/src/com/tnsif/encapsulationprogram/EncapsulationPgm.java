package com.tnsif.encapsulationprogram;

public class EncapsulationPgm {

	// properties
	private int id;
	private String name;

	// getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		EncapsulationPgm e1 = new EncapsulationPgm();

		// setting the values using setters
		e1.setId(101);
		e1.setName("Megha");

		// getting the values using getters
		System.out.println(e1.getId());
		System.out.println(e1.getName());
	}

}
