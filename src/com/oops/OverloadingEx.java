package com.oops;

public class OverloadingEx {
	
	public static int multiply(int a ,int b, int c) {
		return a*b*c;
	}
	public static int multiply(int a ,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OverloadingEx.multiply(4, 5));
		System.out.println(OverloadingEx.multiply(4, 5, 6));

	}

}
