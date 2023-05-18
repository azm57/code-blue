package com.advjavaconcepts;

public class Lambdas {

	public static void main(String[] args) {
		Printable lamdaPrintable = (p, s) -> {
			System.out.println(p + " Meow " + s);
			return "Meow";
		};
		printThing(lamdaPrintable);
	}

	static void printThing(Printable thing) {
		thing.print("!!", "!");
	}

}
