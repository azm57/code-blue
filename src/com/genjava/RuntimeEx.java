package com.genjava;

import java.io.IOException;

public class RuntimeEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println("total memory :"+ Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().exec("calc.exe"));
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().availableProcessors());
		

	}

}
