package com.javaconcepts;

public interface PrivateMethodInterface {
	default void bar() {
		System.out.print("Hello");
		baz();
	}

	private void baz() {
		System.out.println(" world!");
	}

}
