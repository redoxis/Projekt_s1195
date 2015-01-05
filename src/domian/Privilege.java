package domian;

import java.util.ArrayList;
import java.util.List;

public class Privilege 
{
	public Privilege()
	{
		roles = new ArrayList<Role>();
	}
	private int id;

	private String name;
	private List<Role> roles;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}