package com.javaobjectrel;
import java.util.ArrayList;
import java.util.Collections;

class Sstudent implements Comparable<Sstudent>{
	String name;
	int mark;
	Sstudent(String name,int mark){
		this.name = name;
		this.mark = mark;
	}
	@Override
	public int compareTo(Sstudent st) {
		// TODO Auto-generated method stub
		if(mark==st.mark) {
			return 0;
		}else if(mark>st.mark) {
			return 1;
		}
		else 
			return -1;
	}
} 
public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sstudent> als = new ArrayList<Sstudent>();
		als.add(new Sstudent("Alex", 98));
		als.add(new Sstudent("Earl", 75));
		als.add(new Sstudent("Devid", 99));
		als.add(new Sstudent("Carrey", 88));
		als.add(new Sstudent("Bob", 70));
		
		Collections.sort(als);
		for(int i=0;i<als.size();i++) {
			System.out.println(als.get(i).mark);
		}

	}

}
