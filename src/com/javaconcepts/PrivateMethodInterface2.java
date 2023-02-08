package com.javaconcepts;

public interface PrivateMethodInterface2 {
	static void buzz() {
        System.out.print("Hello");
        staticBaz();
    }

    private static void staticBaz() {
        System.out.println(" static world!");
    }

}
