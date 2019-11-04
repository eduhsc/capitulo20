package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProgComparator {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 1200.00));
		list.add(new Product("Radio", 150.00));
		list.add(new Product("Notebook", 1800.00));
		
		list.sort(new MyComparator());
		
		for (Product c: list) {
			System.out.println(c);
		}
		
	}

}
