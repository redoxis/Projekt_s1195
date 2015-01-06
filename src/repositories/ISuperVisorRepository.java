package repositories;

import java.sql.SQLException;
import java.util.List;

import domian.*;


public interface ISuperVisorRepository extends IRepository<SuperVisor> {
	

	public List<SuperVisor> withPerson(Person person);
	public List<Person> withPerson(String personName);
	public List<Person> withId(int SuperVisorId);
	void setUpUpdateQuery(SuperVisor entity) throws SQLException;
	void setUpInsertQuery(SuperVisor entity) throws SQLException;
	String getInsertQuery();
	String getUpdateQuery();

}
