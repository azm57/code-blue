package com.javaobjectrel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Employee> alemp = new ArrayList<>();
		
		alemp.add(new Employee("alex", 1, 1000));
		alemp.add(new Employee("dylon", 4, 1200));
		alemp.add(new Employee("bob", 3, 950));
		alemp.add(new Employee("cathey", 2, 1450));

		Collections.sort(alemp, new SortByName());
		for (int i = 0; i < alemp.size(); i++) {
			System.out.println(alemp.get(i).emp_name + " " + alemp.get(i).emp_id + " " + alemp.get(i).emp_sal);
		}

		System.out.println();

		Collections.sort(alemp, new SortById());
		for (int i = 0; i < alemp.size(); i++) {
			System.out.println(alemp.get(i).emp_name + " " + alemp.get(i).emp_id + " " + alemp.get(i).emp_sal);
		}

		System.out.println();
		Collections.sort(alemp, new SortBySal());
		for (int i = 0; i < alemp.size(); i++) {
			System.out.println(alemp.get(i).emp_name + " " + alemp.get(i).emp_id + " " + alemp.get(i).emp_sal);
		}

	}

}

class Employee {
	String emp_name;
	int emp_id;
	int emp_sal;

	Employee(String n, int id, int sal) {
		this.emp_name = n;
		this.emp_id = id;
		this.emp_sal = sal;
	}
}

class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.emp_name.compareTo(e2.emp_name);
	}

}

class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.emp_id - e2.emp_id;
	}

}

class SortBySal implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.emp_sal - e2.emp_sal;
	}

}
