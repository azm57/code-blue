package com.collectionsrel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonArray {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		hm.put("salary", "20000");
		hm.put("married", "true");
		hm.put("name", "abcd");

		Map<String, Map<String, String>> hm2 = new HashMap<>();
		hm2.put("employee", hm);

		List<Map<String, Map<String, String>>> lst = new ArrayList<Map<String, Map<String, String>>>();
		lst.add(hm2);
		System.out.println(lst);

	}

}
