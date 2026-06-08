package com.tnsif.interfacedemo;

//demo for nested interface
public interface MyInterface {
	void calcarea();

	interface MyInnerInterface {
		int id = 44;

		void print();
	}
}
