package com.tnsif.lambdaexpression;

@FunctionalInterface
interface Parameter {
	String say(String msg); // abstract method
}

public class Multistatement {
	public static void main(String[] args) {
		Parameter p = (msg) -> {
			String str1 = "I would like to say,  ";
			String str2 = str1 + msg;
			return str2;
		};
		System.out.println(p.say("Time is Precious!"));
	}
}
