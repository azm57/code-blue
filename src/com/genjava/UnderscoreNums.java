package com.genjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class UnderscoreNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10_00_000;
		long start,end;
		start = System.currentTimeMillis();
		List<Integer> ArrayList = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			ArrayList.add(i);

		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList "+(end-start));
		
		start = System.currentTimeMillis();
		List<Integer> Vector = new Vector<>();

		for (int i = 0; i < size; i++) {
			Vector.add(i);

		}
		end = System.currentTimeMillis();
		System.out.println("Vector "+(end-start));

	}

}
