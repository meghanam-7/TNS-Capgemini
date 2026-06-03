package com.tnsif.finalpgms;

//demo for final variable

public class FinalVariable {
	/* final int x; // final instance variable must be initialized */
	final int s = 90;
	final static int y;
	final static int z = 70;
	static {
		y = 70;
		/* x=9; //not possible, because x is not static */
	}
}
