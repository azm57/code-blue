package com.designpatterns;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingletonPatternDemo s1 = SingletonInstance.getInstance();
		SingletonPatternDemo s2 = SingletonInstance.getInstance();
		System.out.println(s1.hashCode() + " " + s2.hashCode());
	}
}

class SingletonInstance {
	static SingletonPatternDemo instance = null;

	static SingletonPatternDemo getInstance() {
		if (instance == null)
			instance = new SingletonPatternDemo();
		return instance;
	}
}
