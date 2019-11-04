package entities;

import java.text.DecimalFormat;

public class Product {

	private String name;
	private double value;
	
	public Product(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	DecimalFormat df = new DecimalFormat("#.00");
	public String toString() {
		return this.getName() + ", " + df.format(this.getValue());
	
	}
}
