package com.javaconcepts;

public class Interface implements interface1{
	public static void main(String[] args) {
		interface1 i = new Interface();
		i.print();
	}

}
interface interface1{
	default void print() {
		System.out.println("from interface print");
	}
}
