package domian;
import java.util.ArrayList;
import java.util.List;


public class SuperVisor
{
	public SuperVisor()
	{
		this.person = new ArrayList<Person>();
	}
	private int id;
	private String name;
	private String surrname;
	private boolean active;
	private List<Person> person;
	
	
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public List<Person> getOsoby() {
		return person;
	}
	public void setOsoby(List<Person> osoby) {
		this.person = osoby;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
	}
	
}
