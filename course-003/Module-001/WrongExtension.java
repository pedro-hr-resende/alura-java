/* Author: Pedro Henrique Resende Ribeiro
 * Description: Wrong extension of employee class
 * Date: 17/06/2022 - Hour: 11:15
 */

public class WrongExtension {
	
	// We're trying to add a manager in the system withou inheritance
	
	private String name;
	private String cpf;
	private double salary;
	
	// This attribute will control the employee type
	// 0 - commom employee; 1 - manager; 2 - director
	
	private int type;
	
	// Constructor
	// It isn't necessary create an empty constructor. Java creates automatically
	
	public WrongExtension() {
		
	}
	
	// Methods
	
	public double getBonus() {
		
		if (this.type == 0) {
			return (this.salary * 0.10);
		} else if (this.type == 1) {
			return (this.salary);
		} else {
			return (this.salary + 1000.00);
		}
		
	}
	
	// Getter and setter for employee type
	
	public int getType() {
	
		return this.type;
	
	}
	
	public void setType(int type) {
		
		this.type = type;
		
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
