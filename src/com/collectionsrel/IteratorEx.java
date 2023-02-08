package com.collectionsrel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> st = new HashSet<>();
		st.add(5);
		st.add(2);
		st.add(4);
		st.add(1);
		st.add(3);
		
		Iterator<Integer> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
