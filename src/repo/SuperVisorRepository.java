package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domian.*;
import repositories.*;

public class SuperVisorRepository extends Repository<SuperVisor> implements ISuperVisorRepository
{

	protected SuperVisorRepository(Connection connection, IEntityBuilder<SuperVisor> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(SuperVisor entity) throws SQLException {
		update.setInt(1, entity.getId());
		update.setString(2, entity.getName());
		update.setString(3, entity.getSurrname());

	
	}

	@Override
	protected void setUpInsertQuery(SuperVisor entity) throws SQLException {	
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getSurrname());
		
	}

	@Override
	protected String getTableName() {
		return "supervisor";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO supervisor(name,surrname) values(?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update supervisor set (name,surrname)=(?,?) where id=?";
	}

	@Override
	public List<SuperVisor> withPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> withPerson(String personName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> withId(int SuperVisorId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
