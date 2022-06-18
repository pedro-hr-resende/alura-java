/* Author: Pedro Henrique Resende Ribeiro
 * Description: Employee class
 * Date: 17/06/2022 - Hour: 12:00
 */

public class Employee {
	
	private String name;
	private String cpf;
	
	// Protected allows child classes access this attribute
	// But allows access if a non child class is in the same package
	
	private double salary;
	
	// Constructor
	
	// It isn't necessary create an empty constructor. Java creates automatically
	
	public Employee() {
		
	}
	
	// Methods
	
	public double getBonus() {
		
		return (this.salary * 0.10);
		
	}
	
	// Getters and setters
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getCpf() {
	
		return this.cpf;
	
	}
	
	public void setCpf(String cpf) {
	
		this.cpf = cpf;
	
	}
	
	public double getSalary() {
	
		return salary;
	
	}
	
	public void setSalary(double salary) {
	
		this.salary = salary;
	
	}

}
