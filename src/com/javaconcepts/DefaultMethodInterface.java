package com.javaconcepts;

public interface DefaultMethodInterface {
	default void defaultMethod() {
		System.out.println("default method print");
	}

}