package com.javaconcepts;

public class NonStaticVarFromStaticContext {
	// remove below static to see the error
	static int instanceVariable = 0;

	public static void staticMethod() {
		System.out.println(instanceVariable);
	}

	public static void main(String[] args) {
		NonStaticVarFromStaticContext.staticMethod();
	}

}
