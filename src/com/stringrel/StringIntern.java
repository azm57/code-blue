package com.stringrel;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello"; // scp - string constant pool
        String s2 = new String("hello"); //stores into heap memory

        s2 = s2.intern(); //copy object from heap memory to scp
        System.out.println(s1==s2);

	}

}