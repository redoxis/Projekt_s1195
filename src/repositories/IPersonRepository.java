package repositories;

import java.sql.SQLException;
import java.util.List;

import domian.*;


public interface IPersonRepository extends IRepository<Person> {

	public List<Person> withRole(Role role);
	public List<Person> withRole(String roleName);
	public List<Person> withRole(int roleId);
	void setUpUpdateQuery(Person entity) throws SQLException;
	void setUpInsertQuery(Person entity) throws SQLException;
	String getInsertQuery();
	String getUpdateQuery();
}