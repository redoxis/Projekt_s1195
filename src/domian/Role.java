package domian;
import java.util.ArrayList;
import java.util.List;


public class Role
{
	public Role()
	{
		person = new ArrayList<Person>();
		privileges = new ArrayList<Privilege>();
	}
	private int id;
	private String name;
	private List<Person> person;
	private List<Privilege> privileges;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
