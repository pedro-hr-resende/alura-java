/* Author: Pedro Henrique Resende Ribeiro
 * Description: Declaration of more than one constructor
 * Date: 17/06/2022 - Hour: 00:25
 */

public class Car {

	private int year;
	private String model;
	private double price;
	
	public Car(int year, String model, double price) {
		
		if (year >= 1891) {
		
			this.year = year;
		
		} else {
			
			System.out.println("It will be used the default year");
			this.year = 2017;
			
		}
		
		if (model != null) {
			
			this.model = model;
			
		} else {
			
			System.out.println("It will be used the default model");
			this.model = "Gol";
			
		}
		
		if (price > 0) {
			
			this.price = price;
			
		} else {
			
			System.out.println("It will be used the default price");
			this.price = 40000.00;
			
		}
		
	}
	
	// Declaring a new constructor
	// Different business rules can be created with different constructors
	
	public Car(String model, double price) {
		
		this(2017, model, price);
		
	}
	
	// Getters and setter
	
	public int getYear() {
		
		return year;
		
	}

	public void setYear(int year) {
		
		this.year = year;
		
	}

	public String getModel() {
		
		return model;
		
	}

	public void setModel(String model) {
		
		this.model = model;
		
	}

	public double getPrice() {
		
		return price;
		
	}

	public void setPrice(double price) {
		
		this.price = price;
		
	}
	
}
