package com.tnsif.interfacedemo;

public class NestedInterface implements MyInterface.MyInnerInterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("welcome!!!");
	}

	public static void main(String[] args) {
		NestedInterface n = new NestedInterface();
		n.print();
		System.out.println(n.id);
		System.out.println(NestedInterface.id);
	}

}
