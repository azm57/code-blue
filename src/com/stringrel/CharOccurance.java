package com.stringrel;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		String s1 = "This is coming straight from Washington D.C.";
		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (hm.containsKey(s1.charAt(i))) {
				hm.put(s1.charAt(i), hm.get(s1.charAt(i)) + 1);
			} else {
				hm.put(s1.charAt(i), 1);
			}
		}
		System.out.println(hm);
		Map.Entry<Character, Integer> max = null;
		Map.Entry<Character, Integer> max2 = null;

		for (Map.Entry<Character, Integer> en : hm.entrySet()) {
			if (max == null || en.getValue().compareTo(max.getValue()) > 0) {
				max = en;
			}
		}
		for (Map.Entry<Character, Integer> en2 : hm.entrySet()) {
			if (max2 == null
					|| en2.getValue().compareTo(max2.getValue()) > 0 && en2.getValue().compareTo(max.getValue()) < 0) {
				max2 = en2;
			}
		}
	}

}
