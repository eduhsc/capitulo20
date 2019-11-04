package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

/*	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}*/
	
	@Override
	public int compare(Product p1, Product p2) {
		if (p1.getValue() > p2.getValue()) {
			return 1;
		}
			else if (p1.getValue() < p2.getValue()) {
				return -1;
			}else {
				return 0;
			}
	}

}
