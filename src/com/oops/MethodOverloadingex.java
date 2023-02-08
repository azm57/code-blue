package com.oops;

//int, long, Integer, int...
public class MethodOverloadingex {
	public void print(Integer i) {System.out.println("Integer");}
	public void print(int i) {System.out.println("int");}
	public void print(long i) {System.out.println("long");}
	public void print(int... i) {System.out.println("int var args");
	System.out.println(i.length);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingex t = new MethodOverloadingex();
		t.print(10);

	}

}
