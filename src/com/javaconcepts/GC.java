package com.javaconcepts;

public class GC {

	public static void main(String[] args) {
		Runtime env = Runtime.getRuntime();

		System.out.println("Max Heap Size = maxMemory() = " + env.maxMemory()); //max heap size from -Xmx, i.e. is constant during runtime
		System.out.println("Current Heap Size = totalMemory() = " +  env.totalMemory()); //currently assigned  heap
		System.out.println("Available in Current Heap = freeMemory() = " + env.freeMemory()); //current heap will extend if no more freeMemory to a maximum of maxMemory
		System.out.println("Currently Used Heap = " + (env.totalMemory()-env.freeMemory()) );
		System.out.println("Unassigned Heap = " + (env.maxMemory()-env.totalMemory()));
		System.out.println("Currently Totally Available Heap Space = "+ ((env.maxMemory()-env.totalMemory()) + env.freeMemory()) ); //available=unassigned + free
	}

}
