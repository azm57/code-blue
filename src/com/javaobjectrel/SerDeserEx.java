package com.javaobjectrel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable {
	int prod_id;
	String prod_name;

	Product(int p_id, String p_name) {
		this.prod_id = p_id;
		this.prod_name = p_name;
	}
}

public class SerDeserEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product p1 = new Product(105, "Laptop");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));

		oos.writeObject(p1);
		oos.flush();
		oos.close();
		System.out.println("Success");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
		Product p2 = (Product)in.readObject();
		in.close();
		System.out.println(p2.prod_id+" "+p2.prod_name);

	}

}
