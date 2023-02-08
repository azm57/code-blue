package com.javaconcepts;

public class StaticMethodInterface implements Arithmetic {

	public static void main(String[] args) {
		int result = Arithmetic.multiply(2, 8);
		System.out.println(result);
	}

	@Override
	public int add(int a, int b) {

		return a + b;
	}

}
