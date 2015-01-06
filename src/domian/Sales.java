package domian;

import domian.Entity;

public class Sales extends Entity
{
	public Sales()
	{
		super();
	}
	public Sales(String date, int acc, int cash)
	{
		this.date = date;
		this.acc = acc;
		this.cash = cash;
		
	}
	private String date;
	private int acc;
	private Person person;
	private int cash;
	

	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	
	
}
