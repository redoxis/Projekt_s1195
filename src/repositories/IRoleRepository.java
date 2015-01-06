package repositories;

import java.sql.SQLException;
import java.util.List;

import domian.*;


public interface IRoleRepository extends IRepository<Role> {


	public List<Person> withRole(String roleName);
	public List<Person> withRole(int roleId);
	void setUpUpdateQuery(Role entity) throws SQLException;
	void setUpInsertQuery(Role entity) throws SQLException;
	String getInsertQuery();
	String getUpdateQuery();
}