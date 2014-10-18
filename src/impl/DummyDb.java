package impl;

import java.util.*;

import domian.*;

public class DummyDb {

	public List<Person> persons;
	public List<Sales> sales;
	public List<SuperVisor> superVisor;
	public List<Role> roles;
	
	public DummyDb()
	{
		persons = new ArrayList<Person>();
		sales = new ArrayList<Sales>();
		roles =new ArrayList<Role>();
		superVisor = new ArrayList<SuperVisor>();
	}
	
}