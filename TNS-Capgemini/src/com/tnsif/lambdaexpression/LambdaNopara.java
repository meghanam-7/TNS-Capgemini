package com.tnsif.lambdaexpression;

interface Sayble {
	public String say();
}

public class LambdaNopara {
	public static void main(String[] args) {
		Sayble s = () -> {
			return "i have nothing to say";
		};
		System.out.println(s.say());
	}
}
