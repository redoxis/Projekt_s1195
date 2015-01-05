package domian;

import java.util.ArrayList;
import java.util.List;

public class Person
{
	public Person()
	{
		this.sales = new ArrayList<Sales>();
	}
	private int id;
	private String name;
	private String surrname;
	private String workplace;
	private boolean active;
	private SuperVisor supervisor;
	private List<Sales> sales;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurrname() {
		return surrname;
	}
	public void setSurrname(String surrname) {
		this.surrname = surrname;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public SuperVisor getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(SuperVisor supervisor) {
		this.supervisor = supervisor;
	}
	public List<Sales> getSales() {
		return sales;
	}
	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
