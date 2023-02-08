package com.collectionsrel;

import java.util.HashMap;
import java.util.Map;

public class MaxValueHashTable {
	public static void main(String[] args) {
		String s1 = "abbccccadedcdmghmmmm";

		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			if (hm.containsKey(s1.charAt(i))) {
				hm.put(s1.charAt(i), hm.get(s1.charAt(i)) + 1);
			} else if (!(hm.containsKey(s1.charAt(i)))) {
				hm.put(s1.charAt(i), 1);
			}
		}
		Map.Entry<Character, Integer> MaxEntry = null;
		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
			if (MaxEntry == null || (e.getValue().compareTo(MaxEntry.getValue()) > 0)) {
				MaxEntry = e;
			}
		}
		System.out.println("MaxEntry : " + MaxEntry);

	}

}
