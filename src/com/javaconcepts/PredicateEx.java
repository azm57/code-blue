package com.javaconcepts;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isAdult = age -> age >= 18;
		Predicate<Integer> isSeniorCitizen = age -> age >= 60;
		
		System.out.println(isAdult.test(19));
		System.out.println(isSeniorCitizen.test(65));
		System.out.println(isAdult.test(70) && !isSeniorCitizen.test(70));
	}

}
