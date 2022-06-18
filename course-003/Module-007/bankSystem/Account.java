/* Author: Pedro Henrique Resende Ribeiro
 * Description: Bytebank account class
 * Date: 18/06/2022 - Hour: 01:50
 */

package bankSystem;

public abstract class Account {

	// Private means the attribute can't be read or modified

	private double balance;
	private int agency;
	private int number;

	// This attribute is an object

	private Person person;

	// Using static attribute
	// The value of totalAccount is the same for all objects

	private static int totalAccount;

	// Constructor
	
	public Account(int agency, int number) {

		this.setAgency(agency);
		this.setNumber(number);
		totalAccount++;

	}

	// Methods

	public void depositMoney(double value) {

		if (value > 0) {
			this.balance += value;
		}

	}

	public boolean withdrawMoney(double value) {

		if (this.balance >= value) {

			this.balance -= value;
			return true;

		}

		return false;

	}

	public boolean transferMoney(double value, Account destiny) {

		if (this.withdrawMoney(value)) {

			destiny.depositMoney(value);
			return true;

		}

		return false;

	}

	// Getters and setters

	public double getBalance() {

		return this.balance;

	}

	// It makes no sense to have a method to set balance

	public int getAgency() {

		return this.agency;

	}

	public void setAgency(int agency) {

		if (agency > 0) {
			this.agency = agency;
		}

	}

	public int getNumber() {

		return this.number;

	}

	public void setNumber(int number) {

		if (number > 0) {
			this.number = number;
		}

	}

	public Person getPerson() {

		return this.person;

	}

	public void setPerson(Person person) {

		this.person = person;

	}

	public static int getTotalAccount() {

		return totalAccount;

	}

}
