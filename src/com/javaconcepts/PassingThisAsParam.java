package com.javaconcepts;

public class PassingThisAsParam {

	private String name;
	private int age;

	public PassingThisAsParam() {
		printInstance(this);
	}

	public PassingThisAsParam(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printInstance(PassingThisAsParam thisKeyword) {
		System.out.println(thisKeyword);
	}

	public static void main(String[] args) {
		new PassingThisAsParam();
	}

}
