
public class Person 
{

	private String name;
	private String surrname;
	private String workplace;
	private boolean active;
	private SuperVisor supervisor;
	
	
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
	
}
