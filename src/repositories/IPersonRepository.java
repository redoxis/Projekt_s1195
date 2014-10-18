package repositories;

import java.util.List;

import domian.*;


public interface IPersonRepository extends IRepository<Person> {

	public List<Person> withRole(Role role);
	public List<Person> withRole(String roleName);
	public List<Person> withRole(int roleId);
}