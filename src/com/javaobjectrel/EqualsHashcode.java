package com.javaobjectrel;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen("blue", 10);
		Pen p2 = new Pen("blue", 10);
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		Set<Pen> ps = new HashSet<Pen>();
		ps.add(p1);
		ps.add(p2);

		System.out.println(ps);

	}

}

class Pen {
	String color;
	int price;

	Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return price + color.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Pen that = (Pen) obj;
		boolean isEquals = that.price == this.price && that.color.equals(this.color);
		return isEquals;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color + price;
	}
}
