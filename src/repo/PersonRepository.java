package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domian.*;
import repositories.*;
import unitofwork.IUnitOfWork;

public class PersonRepository extends Repository<Person> implements IPersonRepository
{

	public PersonRepository(Connection connection, IEntityBuilder<Person> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	public void setUpUpdateQuery(Person entity) throws SQLException {
		update.setInt(1, entity.getId());
		update.setString(2, entity.getName());
		update.setString(3, entity.getSurrname());
		update.setString(4, entity.getWorkplace());
	
	}

	@Override
	public void setUpInsertQuery(Person entity) throws SQLException {	
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getSurrname());
		
	}

	@Override
	protected String getTableName() {
		return "person";
	}

	@Override
	public String getInsertQuery() {
		return "INSERT INTO person(name,surrname,workplace) values(?,?,?)";
	}

	@Override
	public String getUpdateQuery() {
		return "update person set (name,surrname,workplace)=(?,?,?) where id=?";
	}

	@Override
	public List<Person> withRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> withRole(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> withRole(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setUpUpdate(Person entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setUpInsert(Person entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getInsert() {
		// TODO Auto-generated method stub
		return null;
	}


}
