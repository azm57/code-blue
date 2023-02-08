package com.collectionsrel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> messageReversed = Arrays.asList("You?", "Are", "How", "Hello");
		List<String> rev = new ArrayList<String>();
		for(int i=0;i<messageReversed.size();i++) {
			rev.add(messageReversed.get(messageReversed.size()-i-1));
		}
		System.out.println(rev);
	}

}
