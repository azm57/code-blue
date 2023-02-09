package com.interview;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ComvileListAsc {

	public static void main(String[] args) {
		Set<Integer> lstInt1 = new TreeSet<>(Arrays.asList(4, 3, 2, 5, 7, 6));
		Set<Integer> lstInt2 = new TreeSet<>(Arrays.asList(8, 13, 20, 15, 17, 1));

		lstInt1.addAll(lstInt2);

		System.out.println(lstInt1);

	}

}
