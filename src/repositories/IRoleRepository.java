package repositories;

import java.util.List;

import domian.*;


public interface IRoleRepository extends IRepository<Role> {


	public List<Person> withRole(String roleName);
	public List<Person> withRole(int roleId);
}