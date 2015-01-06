package repositories;

import java.sql.SQLException;
import java.util.List;

import domian.*;

public interface ISalesRepository extends IRepository<Sales> {

	public List<Sales> withACC(int acc);
	
	public List<Person> withPersonID(int personId);
	List<Sales> withPerson(String name);

	void setUpUpdateQuery(Sales entity) throws SQLException;

	void setUpInsertQuery(Sales entity) throws SQLException;

	String getInsertQuery();

	String getUpdateQuery();
}
