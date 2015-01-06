package domian;
import java.util.ArrayList;
import java.util.List;

import domian.Entity;


public class Role extends Entity
{
	public Role()
	{
		person = new ArrayList<Person>();
		privileges = new ArrayList<Privilege>();
	}
	public Role(String name)
	{
		person = new ArrayList<Person>();
		privileges = new ArrayList<Privilege>();
		this.name = name;
	}
	
	private String name;
	private List<Person> person;
	private List<Privilege> privileges;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
	}
	public List<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}


}
