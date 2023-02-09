package com.advjavaconcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamsRel {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4, 9, 8, 7, 1, 2, 4, 5));
		int data = al.stream().filter(n -> n % 2 == 1).map(n -> n * 2).reduce(0, (c, e) -> c + e);
		System.out.println(data);
	}
}
