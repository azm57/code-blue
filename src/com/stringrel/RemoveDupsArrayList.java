package com.stringrel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupsArrayList {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>(Arrays.asList(1,1,2,2,2,5,4,7,4,8,12));
		Set<Integer> s = new HashSet<>();
		s.addAll(al);
		al.clear();
		al.addAll(s);
		
		System.out.println(al);
		
	}

}
